<p align="center"><img src="image/image.png" /></p>
# Alert Hackthebox
## nmap, 
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