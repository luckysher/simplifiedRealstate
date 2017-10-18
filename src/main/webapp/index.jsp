<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en-IN">
	<head>
			<title>simpRealstate</title>
			<meta charset="utf-8" />
			<meta name="viewport" content="width=device-width, initial-scale=1.0" />
			<!-- Required -->
			<link href="<c:url value="/resources/css/realstate-style.css" />" rel="stylesheet" type="text/css" media="screen">
			<script src="<c:url value="/resources/js/realstate.min.js" />"></script>
			<link rel="icon" href="images/favicon.png" type="image/png">	
	</head>
	<body class="simp-style">
		<header>
			<div class="heading top-heading block-size">
				<h2>SimpRealstate</h2>
			</div>
		</header>
		<div>
			<div class="content">
				<nav>
					<navbar>
						<ul>
							<li><a href="property">View property</a></li>
							<li><a href="appointment">Book appointment</a></li>
							<li><a href="test">Search Property </a></li>
							<li><a href="login">Login</a></li>
							<li><a href="Logout">Logout</a></li>
							<li><a href="addproperty">Add property</a></li>
						</ul>
						
					</navbar>
				</nav>
			</div>
		</div>		
		<footer>
			<div class="footer footer-style block-size">
				<h5>simplify realstate</h5>
			</div>
		</footer>
	</body>
	</html>				   
