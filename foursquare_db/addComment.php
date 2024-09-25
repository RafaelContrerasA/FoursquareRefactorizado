<?php
require 'DBManager.php';
$usuario_user = $_POST['usuario_user'];
$lugar_name = $_POST['lugar_name'];
$comentario = $_POST['comentario'];
$stars = $_POST['stars'];

$db = new DBManager();
$db -> addComment($usuario_user, $lugar_name, $comentario, $stars);
?>