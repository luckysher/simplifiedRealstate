<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class="apppoint-new-box">
		<form:form method="post" commandName="appointment" action="save">
			<div class="form-element">
				<label>
					<strong class="form-label">Client Name</strong>
					<form:input path="name" />
				</label>
				<span>
					<form:errors path="name" cssClass="error" />
				</span>				
			</div>
			<div class="form-element">
				<label>
					<strong class="form-label">Mobile number</strong>
					<form:input path="mobileNum" />
				</label>
				<span>
					<form:errors path="mobileNum" cssClass="error" />
				</span>
			</div>
			
	</form:form>
	</div>
