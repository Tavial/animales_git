<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de edición/modificación</title>
<link rel="stylesheet" type="text/css" href="../css/estilos_admin.css">
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

<jsp:include page="menu.jsp"></jsp:include>
<div>
	<p class="leyenda"> Actualiza los datos de la vivienda: </p>

	<form class="formulario" action="ServletGuardarCambiosVivienda" method="post" enctype="multipart/form-data">

		
		<p> <label>Zona: </label> <input class="entrada_zona" type="text" value="${vivienda.zona}" name="zona" id="zona" size="60" required ="required"/> <span style="color: red">${errorZona}</span> </p>
		<p> <label>Precio: </label> <input class="entrada_precio" type="text"  maxlength="10" value="${vivienda.precio}" name="precio" id="precio" size="15" required="required" required pattern = "^[0-9]+$"/><span style="color: red">${errorPrecio}</span></p>
		<p> <label>Superficie (m2): </label> <input class="entrada_superficie" type="text" maxlength="8" value="${vivienda.superficie}" name="superficie" id="superficie" size="10" required="required" required pattern="^[0-9]+$"/> <span style="color: red">${errorSuperficie}</span></p>
		<p> <label>Tipo de vivienda:</label> 
		<select class="entrada_tipo"  name = "id_tipo" id="id_tipo">
			<c:forEach items="${tipos}" var="tipo">
				<c:choose>
					<c:when test="${vivienda.id_tipo == tipo.id_tipo}">
						<option value="${tipo.id_tipo}" selected="selected">${tipo.tipo}</option>
					</c:when>
					<c:otherwise>
						<option value="${tipo.id_tipo}">${tipo.tipo}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>								
		</select> 	
		</p>
		<p> <label>Habitaciones:</label> <input class="entrada_habitaciones" type="text" maxlength="3" value="${vivienda.habitaciones}" name="habitaciones" id="habitaciones" size="10" required="required" required pattern="^[0-9]+$"/><span style="color: red">${errorHabitaciones}</span></p>
		<p> <label>Baños:</label> <input class="entrada_aseos" type="text" maxlength="3" value="${vivienda.aseos}" name="aseos" id="aseos" size="10" required="required" required pattern="^[0-9]+$"/><span style="color: red">${errorAseos}</span></p>
		<p> <label>Estado:</label> 
			<select class="entrada_estado" name = "id_estado" id="id_estado">
				<c:forEach items="${estados}" var="estado">
					<c:choose>
						<c:when test="${vivienda.id_estado == estado.id_estado}">
							<option value="${estado.id_estado}" selected="selected">${estado.estado}</option>
						</c:when>
						<c:otherwise>
							<option value="${estado.id_estado}">${estado.estado}</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>								
			</select> 	
		</p>	
		<p> <label>Características:</label> <textarea class="entrada_caracteristicas" name="caracteristicas" rows="5" cols="40"> ${vivienda.caracteristicas} </textarea></p>
		<p> <label>Teléfono: </label><input class="entrada_telefono" type="text" value="${vivienda.telefono}" name="telefono" id="telefono" size="15" required="required" required pattern="^[9|6|8|7]{1}([\d]{2}[-]*){3}[\d]{2}$"/><span style="color: red">${errorTelefono}</span></p>
		<p> <label>Email: </label><input class="entrada_email" type="text" value="${vivienda.email}" name="email" id="email" size="15" required="required" required pattern="^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$"/><span style="color: red">${errorEmail}</span></p>
		<br/>
		<div class="contenedor">
			<div class="preview_foto"> <img class="imagen" src="../imagenes/${vivienda.id_vivienda}.jpg" id="imagen"/> </div>
			<div class="elige_foto"> <label>Foto: </label><input class="entrada_foto" type="file" id="foto" name="imagen" accept=".jpg" onchange="previewImage()"/> </div>
			<div class="contenedor_boton"><button class="boton_registrar" type="submit"> GUARDAR CAMBIOS </button> </div>
		</div>
		<input type="hidden" name="id_vivienda" value="${vivienda.id_vivienda}"></input>
		

	</form>
</div>

</body>


</html>