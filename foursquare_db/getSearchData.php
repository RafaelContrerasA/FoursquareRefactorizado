<?php
require 'DBManager.php';
$name = $_POST['name'];

$db = new DBManager();

$resultados = $db -> getSearchData($name);
echo json_encode($resultados);
?>