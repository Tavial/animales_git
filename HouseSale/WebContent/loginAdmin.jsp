<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Control Acceso Área Administración</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>
	<div class="total_inmuebles"> Identifícate como administrador: </div> 
	
	<form class="formulario" action="ServletIdentificarAdmin" method="post">
		<label> Password: </label> <input class="entrada_superficie" type="password" name="pass"/> 
		<button class="boton_buscador" type ="submit">ACCEDER</button>
	</form>
</body>
</html>