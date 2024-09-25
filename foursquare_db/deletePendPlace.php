<?php
require 'DBManager.php';
$name = $_POST['name'];

$db = new DBManager();
$db -> deletePendPlace($name);
?>