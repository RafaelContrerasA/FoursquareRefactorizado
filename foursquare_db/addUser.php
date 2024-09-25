<?php
require 'DBManager.php';

$user = $_POST['user'];
$pass = $_POST['pass'];


$db = new DBManager();
$db->addUser($user, $pass);

echo "Registro exitoso!"

?>