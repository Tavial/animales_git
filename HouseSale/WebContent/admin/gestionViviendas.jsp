<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Administración - Menú</title>
<link rel="stylesheet" type="text/css" href="../css/estilos_admin.css">
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	
	<div class="contenedor">
	
	<c:forEach items="${viviendas}" var="vivienda">
		<div class="anuncio">
			<div class="anuncio_foto"> <img class="imagen" src="../imagenes/${vivienda.id_vivienda}.jpg" id="imagen"/></div>
			<div class="anuncio_texto">
			<b>Zona:</b> ${vivienda.zona} <br/> <!--  llama directamente a los métodos getter de las propiedades. Si no tuviesen ese método daría error -->
			<b>Precio:</b> ${vivienda.precio} <br/>
			<b>Superficie:</b> ${vivienda.superficie} <br/>
			<b>Tipo: </b> ${vivienda.tipo.tipo} <br/>
			<b>Habitaciones: </b> ${vivienda.habitaciones} <br/>
			<b>Aseos:</b> ${vivienda.aseos} <br/>
			<b>Estado:</b> ${vivienda.estado.estado} <br/>
			<b>Caracteristicas:</b> ${vivienda.caracteristicas} <br/>
			<b>Email: </b>${vivienda.email} <br/>
			<b>Teléfono: </b> ${vivienda.telefono} <br/>	
			<!-- Al método borrar le tenemos que pasar el id de la vivienda que queremos borrar -->
			<a onclick="return confirm ('¿estás seguro?')" href ="ServletBorrarVivienda?id_vivienda=${vivienda.id_vivienda}">
				<img class="icono" src="../css/delete.png">
			</a>
			<a href ="ServletEditarVivienda?id_vivienda=${vivienda.id_vivienda}">
				<img class="icono" src="../css/edit.png">
			</a>
			</div>
		</div>
	</c:forEach>
	</div>
</body>
</html>