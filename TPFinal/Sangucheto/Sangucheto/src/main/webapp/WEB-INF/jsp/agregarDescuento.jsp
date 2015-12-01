<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
      <li class="active"><a href="#">Carrito <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span><span
							class="badge">${cantProductosAgregados}</span></a></li>
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
    </ul>
  </div>
</nav>
<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<h2>
				Carrito <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> - <small>Agregar descuentos</small>
			</h2>
			<table class="table table-striped">
				<tr>
					<td>Agregar Descuento:</td>
					<td></td>
					<td>Aplicar</td>
				</tr>
					<form action="insertarDescuento" method="POST">
						<tr>
							<td>Porcentaje de Descuento:</td>
							<td><input type="text" name="porcentaje" value="" id="porcentaje" /></td>
							<td><input type="submit" value="Agregar"></td>
						</tr>
					</form>		
					<form action="insertarDescuento" method="POST">
						<tr>
							<td>Monto de Descuento:</td>
							<td><input type="text" name="monto" value="" id="monto" /></td>
							<td><input type="submit" value="Agregar"></td>
						</tr>
					</form>
			</table>
		</div>
		<div class="col-md-2"></div>
	</div>
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>