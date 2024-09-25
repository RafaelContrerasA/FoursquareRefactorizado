<?php
require 'DBManager.php';

$db = new DBManager();
$resultados = $db -> getPendPlaces();

echo json_encode($resultados);
?>