<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en-IN">
	<head>
			<title>Appointment</title>
			<meta charset="utf-8" />
			<meta name="viewport" content="width=device-width, initial-scale=1.0" />
			<!-- Required -->
			<link href="<c:url value="/resources/css/realstate-style.css" />" rel="stylesheet" type="text/css" media="screen">
			<script src="<c:url value="/resources/js/realstate.min.js" />"></script>
			<link rel="icon" href="images/icon/favicon.png" type="image/png">	
	</head>
	<body class="simp-style">
		<% String block_base="../block"; %>
		<% String ext=".jsp"; %>
		<jsp:include page='<%=block_base + "/header" + ext %>'></jsp:include>
		<div>
			<div class="content">
				<h3>Book your appointment here..</h3>
				<jsp:include page='<%=block_base + "/appointmentform"  + ext %>'></jsp:include>
			</div>
		</div>		
	
	<jsp:include page='<%=block_base + "/footer" + ext %>'></jsp:include>
	</body>
	</html>				   


