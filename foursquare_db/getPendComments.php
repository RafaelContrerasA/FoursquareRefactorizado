<?php
require 'DBManager.php';
$db = new DBManager();
$resultados = $db -> getPendComments();

echo json_encode($resultados);
?>