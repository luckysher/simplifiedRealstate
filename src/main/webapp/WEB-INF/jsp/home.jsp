<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html lang="en-IN">
<head>
<title>simpRealstate</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- Required -->
<link href="<c:url value="/resources/css/realstate-style.css" />"
	rel="stylesheet" type="text/css" media="screen">
<script src="<c:url value="/resources/js/realstate.min.js" />"></script>
<link rel="icon" href="images/icon/favicon.png" type="image/png">
</head>
<body class="simp-style">
	<% String block_base="../block/"; %>
	<% String ext=".jsp"; %>
	<jsp:include page='<%=block_base + "header" + ext %>'></jsp:include>
	<div>
		<div class="content">
			<center>
			<h2>Today`s Appointments</h2>
			<table>		
					<tr>
		            	<td align="center"><h3>Id</td>
		            	<td align="center"><h3>Name</h3></td>
		             	<td align="center"><h3>Address</h3></td>
		             	<td align="center"><h3>Contact Num</h3></td>
		             	<td align="center"><h3>Area</h3></td>
		             	<td align="center" colspan="2"><h3>Details</h3></td>
		          	</tr>	
				<c:forEach items = "${appointments}" var="appointment">
		          	<!-->form:form method="post" action="update/status/${appointment.getId()}" -->
			          	<!--form:input type="hidden" path="id" value="${appointment.getId()}"/ -->
				          	<tr>
				            	<td align="center">${appointment.getId()}</td>
				            	<td align="center">${appointment.getName()}</td>
				            	<td align="center">${appointment.getAddress()}</td>
				            	<td align="center">${appointment.getMobileNum()}</td>
				            	<td align="center">${appointment.getArea()}</td>
				            	<td align="center">${appointment.getDetails()}</td>
				            	<!-- >td align="center"><input type="submit" onclick="alert('submit');" value="Cilck to set done status" /></td-->
				          	</tr>
			          	<!--  >/form:form -->
	          	</c:forEach>
          	</table>
          	</center>
		</div>
	</div>

	<jsp:include page='<%=block_base + "footer" + ext %>'></jsp:include>
</body>
</html>
