from http.server import BaseHTTPRequestHandler, HTTPServer
from bs4 import BeautifulSoup
 
class WebHandler(BaseHTTPRequestHandler):
    def do_POST(self):
        content_length = int(self.headers.get('Content-Length',0))
        post_body = self.rfile.read(content_length).decode('utf-8')
        soup = BeautifulSoup(post_body, 'html.parser')
        subject = soup.select_one("h2.subject")
        subject_text = subject.get_text(strip=True).replace("Open in new window","")
        from_field = soup.select_one("td.header.from a")
        from_text = from_field.get_text(strip=True)
        message_body = soup.select_one("#messagebody")
        message_text = message_body.get_text(strip=True).replace("""Confidentiality Notice: This electronic communication may contain confidential or privileged information. Any unauthorized review, use, disclosure, copying, distribution, or taking of any part of this email is strictly prohibited.If you suspect that you've received a "phishing" e-mail, please forward the entire email to our security engineer atbcase@drip.htb""","")
        print(f"{subject_text}")
        print(f"from: {from_text}")
        print(message_text)
        print("______")

if __name__ == "__main__":
    server_address = ("0.0.0.0", 8082)
    httpd = HTTPServer(server_address, WebHandler)
    try:
        httpd.serve_forever()
    except KeyboardInterrupt:
        httpd.server_close()