<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link href='<c:url value="/css/bootstrap-tema.min.css"/>' rel="stylesheet">
</head>
<body>
	<h1>Home Sanguchetto!</h1>
		<c:forEach var="ingrediente" items="${model}">
			${ingrediente.nombre}
		</c:forEach>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src='<c:url value="/js/jquery-1.11.3.min.js"/>'></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="../../js/bootstrap.min.js"></script>
</body>
</body>
</html>