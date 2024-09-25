<?php
require 'DBManager.php';
$lugar_name = $_POST['lugar_name'];

$db = new DBManager();
$resultados = $db -> getPictures($lugar_name);

echo json_encode($resultados);
?>