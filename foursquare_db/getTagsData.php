<?php
require 'DBManager.php';
$T1 = $_POST['T1'];
$T2 = $_POST['T2'];
$T3 = $_POST['T3'];
$T4 = $_POST['T4'];
$T5 = $_POST['T5'];
$T6 = $_POST['T6'];
$T7 = $_POST['T7'];

$db = new DBManager();

$tags = array($T1, $T2, $T3, $T4, $T5, $T6, $T7);
$resultados = $db -> getTagsData($tags);
echo json_encode($resultados);
?>