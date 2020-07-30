<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
<script>

function previewImage() {
    var reader = new FileReader();
    reader.readAsDataURL(document.getElementById('foto').files[0]);
    reader.onload = function (e) {
        document.getElementById('imagen').src = e.target.result;
    };
    const fi = document.getElementById('foto');
    // Se comprueba el fichero que es seleccionado
    if (fi.files.length > 0) {
        for (const i = 0; i <= fi.files.length - 1; i++) {

            const fsize = fi.files.item(i).size;
            const file = Math.round((fsize / 1024));
            // El tamaño del fichero
            if (file > 2048) {
                alert(
                  "Archivo demasiado grande. Por favor, escoge un archivo de menos de 0.5 MB");
                fi.value =""; // Reseteamos el valor
                fi.files[0].name="";
            }
        }
    }
}
 
</script>


</head>
<body> 
	<!--  Incluimos también el menú -->
	<jsp:include page="menu.jsp"></jsp:include>
	<div>
	
		<p class="leyenda">Introduce los datos del inmueble: </p>
	
		<form class="formulario" action="guardarNuevaVivienda" method="post" enctype="multipart/form-data">
			<p> <label>Zona:</label> <input class="entrada_zona" type="text" name="zona" id="zona" size="60" required ="required"/> <span style="color: red">${errorZona}</span> </p>
			<p> <label>Precio:</label> <input class="entrada_precio" type="text" maxlength="10" name="precio" id="precio" size="15" required="required" required pattern="^[0-9]+$"/><span style="color: red">${errorPrecio}</span></p>
			<p> <label>Superficie (m2):</label> <input class="entrada_superficie" type="text" maxlength="8" name="superficie" id="superficie" size="10" required="required" required pattern="^[0-9]+$"/> <span style="color: red">${errorSuperficie}</span> </p>  
			<p> <label> Tipo de vivienda: </label>
				<select class="entrada_tipo" name = "id_tipo" id="tipo">
					<c:forEach items="${tipos}" var="tipo">
						<option value="${tipo.id_tipo}">${tipo.tipo}</option>
						
					</c:forEach>
				</select> 	
			</p>
			<p> <label> Habitaciones: </label> <input class="entrada_habitaciones" type="text" name="habitaciones" maxlength="3" id="habitaciones" size="10" required="required" required pattern="^[0-9]+$"/> <span style="color: red">${errorHabitaciones}</span> </p>
			<p> <label> Baños: </label> <input class="entrada_aseos" type="text" name="aseos" id="aseos" size="3" maxlength="3" required="required" required pattern = "^[0-9]+$" /> <span style="color: red">${errorAseos}</span> </p>
			<p> <label> Estado: </label>
				<select class="entrada_estado" name = "id_estado" id="estado">
					<c:forEach items="${estados}" var="estado">
						<option value="${estado.id_estado}">${estado.estado}</option>
						
					</c:forEach>		
					
				</select> 	
			</p>	
			<fieldset>
				<legend> Características </legend>

					<input type="checkbox" name="aire" id="aire"> Aire acondicionado 
					<input type="checkbox" name="armarios" id="armarios"> Armarios empotrados
					<input type="checkbox" name="ascensor"  id="ascensor"> Ascensor
				
					<input type="checkbox" name="exterior" id="exterior"> Exterior  
					<input type="checkbox" name="garaje"  id="garaje"> Garaje
					<input type="checkbox" name="jardin"  id="jardin"> Jardín
				
					<input type="checkbox" name="piscina"  id="piscina"> Piscina
					<input type="checkbox" name="terraza" id="terraza"> Terraza
					<input type="checkbox" name="trastero"  id="trastero"> Trastero
				
					<input type="checkbox" name="verde"  id="verde"> Zonas verdes
				
			</fieldset>
			<p> <label> Teléfono: </label> <input class="entrada_telefono" type="text" name="telefono" id="telefono" size="15" required="required" required pattern="^[9|6|8|7]{1}([\d]{2}[-]*){3}[\d]{2}$"/> <span style="color: red">${errorTelefono}</span> </p>
			<p> <label> Email: </label><input class="entrada_email" type="text" name="email" id="email" size="15" required="required" required pattern="^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$"/> <span style="color: red">${errorEmail}</span></p>
			<div class="contenedor">	
				<div class="preview_foto"><img src="css/sin_imagen.jpg" class="imagen"  id="imagen" /></div>
				<div class="elige_foto"> <label> Foto: </label> <input  class="entrada_foto" type="file" name="imagen" id="foto" accept=".jpg" onchange="previewImage()"> </div>
				<div class="contenedor_boton"> <button class="boton_registrar" type="submit"> REGISTRAR </button> </div>
			</div>	
		</form>
	</div>
</body>
</html>