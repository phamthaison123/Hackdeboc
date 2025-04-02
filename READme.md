<p align="center"><img src="image/image.png" /></p>

# Alert Hackthebox
## nmap, 
### Nmap
```
nmap -sCV -Pn 10.10.11.44 -oA nmap/output
```
<pre style="border: 1px solid #ccc; padding: 10px; border-radius: 5px;">
PORT
STATE SERVICE VERSION
22/tcp open
ssh
OpenSSH 8.2p1 Ubuntu 4ubuntu0.11 (Ubuntu Linux; protocol
2.0)
| ssh-hostkey:
|3072 7e:46:2c:46:6e:e6:d1:eb:2d:9d:34:25:e6:36:14:a7 (RSA)
|256 45:7b:20:95:ec:17:c5:b4:d8:86:50:81:e0:8c:e8:b8 (ECDSA)
|_256 cb:92:ad:6b:fc:c8:8e:5e:9f:8c:a2:69:1b:6d:d0:f7 (ED25519)
80/tcp open
http
Apache httpd 2.4.41 ((Ubuntu))
|_http-title: Did not follow redirect to http://alert.htb/
|_http-server-header: Apache/2.4.41 (Ubuntu)
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel
</pre>
{% include nmap/output.nmap }