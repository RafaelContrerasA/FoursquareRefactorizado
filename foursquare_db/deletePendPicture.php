<?php
require 'DBManager.php';
$id = $_POST['id'];

$db = new DBManager();
$db -> deletePendPicture($id);
?>