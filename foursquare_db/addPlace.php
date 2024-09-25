<?php
require 'DBManager.php';

$name = $_POST['name'];
$descripcion = $_POST['descripcion'];
$ciudad = $_POST['ciudad'];
$estado = $_POST['estado'];
$cp = $_POST['cp'];
$numeroext = $_POST['numeroext'];
$numeroint = $_POST['numeroint'];
$colonia = $_POST['colonia'];
$calle = $_POST['calle'];
$etiquetas = $_POST['etiquetas'];
$valido = $_POST['valido'];
$user = $_POST['user'];

$db = new  DBManager();
$db -> addPlace($name, $descripcion, $ciudad, $estado, $cp, $numeroext, $numeroint, $colonia, $calle, $etiquetas, $valido, $user);
?>