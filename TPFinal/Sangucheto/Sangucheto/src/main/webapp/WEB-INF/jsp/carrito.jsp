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
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<input type="image" width="50px"
				src="<%=request.getContextPath()%>/img/carrito.png">
			<h2>
				Carrito - <small>Listado de productos agregados</small>
			</h2>
			<form action="confirmarCarrito" method="POST">
				<table class="table table-striped">
					<tr>
						<td>Producto</td>
						<td>Precio</td>

					</tr>
					<c:if test="${fn:length(tabla)>0}">
						<c:forEach items="${tabla}" var="producto">
							<tr>
								<td>${producto.nombre}</td>
								<td>$ ${producto.precio}</td>

							</tr>
						</c:forEach>
					</c:if>
					<c:if test="${fn:length(tabla)<1}">


						<tr>
							<td align="center" colspan="2" style="color: blue;">El
								carrito se encuentra Vacio.</td>

						</tr>
					</c:if>
					<tr class="info">
						<td>Total:</td>
						<td>${total}</td>
					</tr>
					<tr class="warning">
						<td>Total con Descuento:</td>
						<td>${totalDescuento}</td>
					</tr>
					<tr class="success">
						<td>Total Ahorrado:</td>
						<td>${totalAhorrado}</td>
					</tr>
				</table>
				<c:if test="${fn:length(tabla)>0}">
					<input type="submit" class="btn btn-primary" value="Confirmar">
				</c:if>


				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target="#myModal">Cancelar</button>
			</form>


			<br> <a href="agregarAlCarrito">Agregar al Carrito </a><br>
			<a href="agregarDescuentos">Agregar Descuentos</a>
		</div>
		<div class="col-md-2"></div>
	</div>


	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">�Vaciar Carrito?</h4>
				</div>
				<div class="modal-body">�Esta usted seguro que desea vaciar su
					carrito?</div>
				<div class="modal-footer">
					<form action="vaciarCarrito" method="POST">
						<input type="submit" class="btn btn-default"
							value="Si, estoy seguro.">
					</form>
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>