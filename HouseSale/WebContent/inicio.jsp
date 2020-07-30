<!--  Vamos a utilizar la parte de core de esta librería
cada vez que ponga "c" en esta web estoy llamando a algo de la librería que he traido -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>HOUSESALE. Página de anuncios </title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>

	<!--  Directiva. Tiene varias, una de ellas es un include que permite incrustar elementos jsp, como por ejemplo un menú   -->
	<jsp:include page="menu.jsp"></jsp:include> <!-- creamos ese menú en el archivo menu.jsp  -->
	
	<nav>
		<div class="buscador">
			<label> Buscar por: </label>
		
			<form action="inicio">
				<label>Zona: </label><input class="input_zona" type="text" name="zona" value="${zonaAbuscar}"/>
				<label>Precio entre: </label><input class="input_precio" type="text" name="precio_min" pattern="^[0-9]+$" maxlength="10" value="${precioMinAbuscar}"/><label> y</label> <input class="input_precio" type="text" name="precio_max" pattern="^[0-9]+$" maxlength="10" value="${precioMaxAbuscar}"/>
				<label>Superficie entre:</label> <input class="input_superficie" type="text" name="superficie_min" pattern="^[0-9]+$" maxlength="10" value="${superficieMinAbuscar}"/> <label>y</label> <input class="input_superficie" type="text" name="superficie_max" pattern="^[0-9]+$" maxlength="10" value="${superficieMaxAbuscar}"/>
				<button class="boton_buscador" type="submit">Buscar</button>
			</form>
			<a class="reseteo" href = "inicio"> resetear búsqueda</a>
		</div>
	</nav>
	<!--  NUMERO DE PAGINAS  -->
	<div class="total_inmuebles">
		Nº de inmuebles: ${total}
	</div>
		
	<!--  PAGINACION  -->

	<div>
		<!-- Va a inicio  (inicio es la ruta por la que salta este servlet) -->
		<!--  sacamos el enlace de ANTERIOR cuando haya anuncios por detrás de donde estamos, sino no -->
		<ul class="paginacion">
		<c:if test="${anterior >= 0}">
			<!-- ponemos el resto de parámetros para que no se "pierdan" los parámetros de las búsquedas -->
			<li>
				<a href="inicio?comienzo=${anterior}&zona=${zonaAbuscar}&precio_min=${precioMinAbuscar}&precio_max=${precioMaxAbuscar}&superficie_min=${superficieMinAbuscar}&superficie_max=${superficieMaxAbuscar}">ANTERIOR</a>
			</li>
				
		</c:if>
		<!-- Va a llamar a inicio pero le va a pasar por parámetro un nuevo comienzo -->
		<!--  si aún faltan por mostrar anuncios sacamos el enlace de SIGUIENTE, sino no -->
		<c:if test="${siguiente<total}">	
			<!-- ponemos el resto de parámetros para que no se "pierdan" los parámetros de las búsquedas -->
			<li>
				<a href="inicio?comienzo=${siguiente}&zona=${zonaAbuscar}&precio_min=${precioMinAbuscar}&precio_max=${precioMaxAbuscar}&superficie_min=${superficieMinAbuscar}&superficie_max=${superficieMaxAbuscar}">SIGUIENTE</a>
			</li>
		</c:if>
		</ul>
	</div>
	
	<div class="contenedor">
	<!--  Usamos la libreria para recorrer con un forEacb la lista de libros que recibimos a través del forward -->
	<c:forEach items="${viviendas}" var="vivienda">
	
		<div class="anuncio">
			<div class="anuncio_foto"> <img class="imagen" src="imagenes/${vivienda.id_vivienda}.jpg"/></div>
			<div class="anuncio_texto">
				<b>Zona:</b> ${vivienda.zona} <br/> <!--  llama directamente a los métodos getter de las propiedades. Si no tuviesen ese método daría error -->
				<b>Precio:</b> ${vivienda.precio} <b>€</b> <br/>
				<b>Superficie:</b> ${vivienda.superficie} <br/>
				<b>Tipo:</b> ${vivienda.tipo.tipo} <br/>
				<b>Habitaciones:</b> ${vivienda.habitaciones} <br/>
				<b>Aseos: </b>${vivienda.aseos} <br/>
				<b>Estado: </b> ${vivienda.estado.estado} <br/>
				<b>Caracteristicas:</b> ${vivienda.caracteristicas} <br/>
				<b>Email:</b> ${vivienda.email} <br/>
				<b>Teléfono:</b> ${vivienda.telefono} <br/>
			</div>
		</div>
		
	</c:forEach>
	</div>
	
	<!-- Colocamos otra barra de paginación al final por comodidad en la navegación -->
	<div>
		<!-- Va a inicio  (inicio es la ruta por la que salta este servlet) -->
		<!--  sacamos el enlace de ANTERIOR cuando haya anuncios por detrás de donde estamos, sino no -->
		<ul class="paginacion">
		<c:if test="${anterior >= 0}">
			<!-- ponemos el resto de parámetros para que no se "pierdan" los parámetros de las búsquedas -->
			<li>
				<a href="inicio?comienzo=${anterior}&zona=${zonaAbuscar}&precio_min=${precioMinAbuscar}&precio_max=${precioMaxAbuscar}&superficie_min=${superficieMinAbuscar}&superficie_max=${superficieMaxAbuscar}">ANTERIOR</a>
			</li>
				
		</c:if>
		<!-- Va a llamar a inicio pero le va a pasar por parámetro un nuevo comienzo -->
		<!--  si aún faltan por mostrar anuncios sacamos el enlace de SIGUIENTE, sino no -->
		<c:if test="${siguiente<total}">	
			<!-- ponemos el resto de parámetros para que no se "pierdan" los parámetros de las búsquedas -->
			<li>
				<a href="inicio?comienzo=${siguiente}&zona=${zonaAbuscar}&precio_min=${precioMinAbuscar}&precio_max=${precioMaxAbuscar}&superficie_min=${superficieMinAbuscar}&superficie_max=${superficieMaxAbuscar}">SIGUIENTE</a>
			</li>
		</c:if>
		</ul>
	</div>
	
</body>
</html>