<¿php
$Usuario=$_POST ['Usuario'];
$ID=$_POST ['ID'];

//base de datos:
//$Conexion = mysqli_connect("localhost", "Usuario", "", "*Nombre/base*")
//$Consulta="Select * FROM usuarios WHERE usuarios = '$Usuario' and ID = '$ID' ";
//$Resultado = mysqli_query($Conexion, $Consulta);

//$Filas=mysqli_num_rows($Resultado);

if ($Filas > 0){

	header ("location:Bienvenida.html");
}

else {
	
	echo "Error";

}

mysqli_free_result($Resultado);
mysqli_close ($Conexion);