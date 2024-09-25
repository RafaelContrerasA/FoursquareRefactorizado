<?php
require 'DBManager.php';
$usuario_user = $_POST['usuario_user'];
$lugar_name = $_POST['lugar_name'];


$db = new DBManager();
$resultados = $db -> getCheck($lugar_name, $usuario_user);

echo json_encode($resultados);
?>