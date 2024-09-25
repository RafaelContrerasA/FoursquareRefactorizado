<?php
require 'DBManager.php';

$user = $_POST['user'];
$pass = $_POST['pass'];

$db = new DBManager();
$resultados = $db->findUser($user, $pass);

echo json_encode($resultados);
?>