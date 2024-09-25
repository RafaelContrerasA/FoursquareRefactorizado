<?php
require 'DBManager.php';
$foto = $_POST['foto'];
$lugar_name = $_POST['lugar_name'];
$usuario_user = $_POST['usuario_user'];

$db = new DBManager();
$db -> addPicture($foto, $lugar_name, $usuario_user);
?>