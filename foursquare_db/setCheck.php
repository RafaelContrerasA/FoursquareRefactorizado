<?php
require "DBManager.php";
$usuario_user = $_POST['usuario_user'];
$lugar_name = $_POST['lugar_name'];

$db = new DBManager();
$db -> setCheck($lugar_name, $usuario_user);
?>