<?php

$mysql = new mysqli("localhost", "root", "", "my_uca");
if($mysql->connect_error){
echo"Error: ";
die("Error de conexion");

}
else{
echo "Conexion exitosa";

}

?>