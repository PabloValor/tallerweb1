<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sanguchetto</title>
<!-- Bootstrap -->
<link href="css/bootstrap-tema.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
  <!-- El logotipo y el icono que despliega el menú se agrupan
       para mostrarlos mejor en los dispositivos móviles -->
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse"
            data-target=".navbar-ex1-collapse">
      <span class="sr-only">Desplegar navegación</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">SANGUCHETTO</a>
  </div>
 
  <!-- Agrupar los enlaces de navegación, los formularios y cualquier
       otro elemento que se pueda ocultar al minimizar la barra -->
  <div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav">
      <li class="active"><a href="carrito">Carrito
      <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
      <span	class="badge">${cantProductosAgregados}</span>
      </a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Stock <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="agregarStock">Agregar Stock a Productos</a></li>          
          <li><a href="stockExistentes">Stock de Productos Existentes</a></li>
          <li class="divider"></li>
          <li><a href="eliminarIngrediente">Eliminar Stock a Producto</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Ingredientes <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="agregarIngrediente">Dar de Alta un Ingrediente</a></li>
        </ul>
      </li>
      <li><a href="agregarAlCarrito">Agregar a Carrito</a></li>
    </ul>
  </div>
</nav>

<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<h2>
				Stock - <small>Alta</small>
			</h2>
			<table class="table table-striped">
				<tr>
					<td>Nombre</td>
					<td>Precio</td>
					<td>Stock</td>
					<td>Cantidad</td>
					<td>Enviar</td>
				</tr>
				<c:forEach items="${tabla}" var="producto">
					<form action="insertarStock" method="POST">
						<tr>
							<td>${producto.key.nombre}</td>
							<input type="text" name="nombre" value="${producto.key.nombre}"
								id="nombre" hidden />
							<td>$ ${producto.key.precio}</td>
							<input type="text" name="precio" value="${producto.key.precio}"
								id="precio" hidden />
							<td>${producto.value}</td>
							<td><input type="number" width="50px" name="cantidad"
								value="0" min="0" id="cantidad" class="form-control"></input></td>
							<td><input type="submit" value="Agregar"></td>
						</tr>
					</form>
				</c:forEach>
			</table>
		</div>
		<div class="col-md-2"></div>
	</div>
	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>