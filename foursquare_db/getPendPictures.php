<?php
require 'DBManager.php';
$db = new DBManager();
$resultados = $db -> getPendPictures();

echo json_encode($resultados);
?>