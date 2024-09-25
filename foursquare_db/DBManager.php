<?php

class DBManager {
	private $db;
	private $host;
	private $user;
	private $pass;

	function __construct() {
		$this->db = 'foursquare';
		$this->host = '127.0.0.1';
		$this->user = 'root';
		$this->pass = null;
	}

	private function open() {
		$link = mysqli_connect(
			$this->host, 
			$this->user, 
			$this->pass, 
			$this->db
		) or die('Error conectando a la base de datos');
		return $link;
	}

	private function close($link) {
		mysqli_close($link);
	}

    /////Funtions releated to User data

    public function findUser($usr, $pass){
        $sql = "SELECT * FROM usuario WHERE user = '$usr' AND pass = SHA1('$pass')";
        $link = $this->open();
    
        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function addUser($user, $pass){
        $admin = 0;
        if($user == 'fergetse')
            $admin = 1;

        $sql = "INSERT INTO usuario VALUES ('$user', SHA1('$pass'), $admin, NULL)";
		$link = $this->open();

		mysqli_query($link, $sql) or die("Error query");
		$this->close($link);
    }

    ///////// Functions releated to Places

    public function addPlace($name, $descripcion, $ciudad, $estado, $cp, $numeroext, $numeroint, $colonia, $calle, $etiquetas, $valido, $user){
        $sql = "INSERT INTO lugar VALUES('$name', '$ciudad', '$estado', $cp, $numeroext, $numeroint, '$colonia', '$calle', '$etiquetas', $valido, '$descripcion', '$user')";
        $link = $this -> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    public function findPlace($name){
        $sql = "SELECT * FROM lugar WHERE name = '$name'";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function getPlaces(){
        $sql = "SELECT * FROM lugar WHERE valido = 1";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function getPendPlaces(){
        $sql = "SELECT * FROM lugar WHERE valido = 0";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function updateValidoPlace($name){
        $sql = "UPDATE lugar SET valido = 1 WHERE name = '$name'";
        $link = $this -> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    public function deletePendPlace($name){
        $sql = "DELETE FROM lugar WHERE name = '$name'";
        $link = $this -> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

//////////////Functions for comments

    public function getComments($lugar_name){
        $sql = "SELECT * FROM puntuacion WHERE lugar_name = '$lugar_name' AND valido = 1";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function addComment($usuario_user, $lugar_name, $comentario, $stars){
        $sql = "INSERT INTO puntuacion VALUES (NULL, $stars , '$comentario', 0, '$usuario_user', '$lugar_name')";
        $link = $this -> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    public function getPendComments(){
        $sql = "SELECT * FROM puntuacion WHERE valido = 0";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function updateValidoComment($id){
        $sql = "UPDATE puntuacion SET valido = 1 WHERE id = $id";
        $link = $this-> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    public function deletePendComment($id){
        $sql = "DELETE FROM puntuacion WHERE id = $id";
        $link = $this -> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    ////////////Funtions releated to Pictures and gallery

    public function addPicture($foto, $lugar_name, $usuario_user){
        $sql = "INSERT INTO foto VALUES(NULL, '$foto', 0, '$lugar_name', '$usuario_user')";
        $link = $this -> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    public function getPictures($lugar_name){
        $sql = "SELECT * FROM foto WHERE fotocol = 1 AND lugar_name = '$lugar_name'";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function getPendPictures(){
        $sql = "SELECT * FROM foto WHERE fotocol = 0";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function updateValidoPicture($id){
        $sql = "UPDATE foto set fotocol = 1 where id = $id";
        $link = $this-> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    public function deletePendPicture($id){
        $sql = "DELETE FROM foto WHERE id = $id";
        $link = $this -> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    ///////Special cases for selects

    public function getTagsData($etiqueta){
        $sql = "SELECT * FROM lugar WHERE";
        for($i = 0; $i < count($etiqueta); $i++){
            if($etiqueta[$i] == null)
                $etiqueta[$i] = "";

            if($i == count($etiqueta) -1)
                $sql .= " etiquetas LIKE '%" . $etiqueta[$i] . "%' AND valido = 1";
            else
                $sql .= " etiquetas LIKE '%" . $etiqueta[$i] . "%' AND";
        }
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function getSearchData($name){
        $sql = "SELECT * FROM lugar WHERE name LIKE '%$name%' AND valido = 1";
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }

    public function getBoth($etiqueta, $name){
        $sql = "SELECT * FROM lugar WHERE";
        for($i = 0; $i < count($etiqueta); $i++){
            if($etiqueta[$i] == null)
                $etiqueta[$i] = "";

            if($i == count($etiqueta) -1)
                $sql .= " etiquetas LIKE '%" . $etiqueta[$i] . "%' AND name LIKE '%$name%' AND valido = 1";
            else
                $sql .= " etiquetas LIKE '%" . $etiqueta[$i] . "%' AND";
        }
        $link = $this -> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }


    ////////Functions releated to check in

    public function setCheck($lugar_name, $usuario_user){
        $sql = "INSERT INTO checkin VALUES(NULL, 1, '$lugar_name','$usuario_user')";
        $link = $this-> open();

        mysqli_query($link, $sql) or die ("Error querry");
        $this -> close($link);
    }

    public function getCheck($lugar_name, $usuario_user){
        $sql = "SELECT * FROM checkin WHERE lugar_name = '$lugar_name' AND usuario_user = '$usuario_user'";
        $link = $this-> open();

        $results = mysqli_query($link, $sql) or die("Error query");
        $resultados = array();
        while( ($fetch = mysqli_fetch_array($results, MYSQLI_ASSOC)) != NULL) {
            array_push($resultados, $fetch);
        }
    
        $this->close($link);
        return $resultados;
    }
}