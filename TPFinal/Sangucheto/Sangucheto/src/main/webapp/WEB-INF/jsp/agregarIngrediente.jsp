<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Carrito <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true">
          <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="agregarAlCarrito">Agregar</a></li>        
          <li class="divider"></li>
          <li><a href="carrito">Ver</a></li>          
        </ul>
      </li>
      
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Stock <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="agregarStock">Alta</a></li>          
          <li><a href="stockExistentes">Consulta</a></li>
          <li class="divider"></li>
          <li><a href="eliminarIngrediente">Eliminar</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Ingredientes <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="agregarIngrediente">Alta</a></li>
          <li class="divider"></li>
          <li><a href="consultarIngrediente">Consulta</a></li>
        </ul>
      </li>      
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
				Nombre: <input type="text" name="nombre" id="nombre"
					class="form-control"></input> 
				Precio: <input
					type="text" name="precio" id="precio" class="form-control"></input>
				Tipo: 
                      <select class="form-control" name="tipo" id="tipo">
                          <option value="INGREDIENTE">Ingrediente</option>
                          <option value="CONDIMENTO">Condimento</option>                                 
                      </select> 
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


	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>