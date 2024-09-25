<?php
require 'DBManager.php';

$db = new DBManager();
$resultados = $db -> getPlaces();

echo json_encode($resultados);
?>