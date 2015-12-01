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
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
  <!-- El logotipo y el icono que despliega el men� se agrupan
       para mostrarlos mejor en los dispositivos m�viles -->
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse"
            data-target=".navbar-ex1-collapse">
      <span class="sr-only">Desplegar navegaci�n</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">SANGUCHETTO</a>
  </div>
 
  <!-- Agrupar los enlaces de navegaci�n, los formularios y cualquier
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
		<div class="col-xs-6 col-md-4"></div>
		<div class="col-xs-6 col-md-4">
			<h2>
				Ingrediente - <small>Alta</small>
			</h2>
		</div>
		<div class="col-xs-6 col-md-4"></div>
	</div>

	<form action="insertarIngrediente" method="POST">
		<div class="row">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4">
				Nombre del Producto: <input type="text" name="nombre" id="nombre"
					class="form-control"></input> Precio del Ingrediente: <input
					type="text" name="precio" id="precio" class="form-control"></input>
			</div>
			<div class="col-xs-6 col-md-4"></div>

		</div>

		<div class="row">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4 text-center">
				</br> <input class="btn btn-primary" type="submit" name="btnAceptar"
					Value="Aceptar"></input>
			</div>
			<div class="col-xs-6 col-md-4"></div>
		</div>
	</form>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>