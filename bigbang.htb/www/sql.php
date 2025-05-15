<?php
if ($argc < 2) {
    die("Usage: php script.php \"SQL_QUERY\"\n");
}

$query = $argv[1];
$host = '172.17.0.1';
$user = 'wp_user';
$password = 'wp_password';
$database = 'wordpress'; // Change this if needed
$conn = new mysqli($host, $user, $password, $database);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error . "\n");
}

$result = $conn->query($query);
if ($result === false) {
    die("Query error: " . $conn->error . "\n");
}
if ($result instanceof mysqli_result) {
    while ($row = $result->fetch_assoc()) {
        echo json_encode($row, JSON_PRETTY_PRINT) . "\n";
    }
    $result->free();
} else {
    echo "Query executed successfully.\n";
}
$conn->close();
?>