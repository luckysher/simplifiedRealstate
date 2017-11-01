<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" action="save">
	<table>
		<tr>
			<td>
				<form:label path="name"> 
						<spring:message text="Client Name" />
				</form:label>
			</td>
			<td>
				<form:input path="name" />
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="mobileNum">
						<spring:message text="Mobile No." />
				</form:label>
			</td>
			<td>
				<form:input path="mobileNum" />
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="address">
					<spring:message text="Address" />
				</form:label>
			</td>
			<td>
				<form:input path="address" />
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="area">
					<spring:message text="Property area" />
				</form:label>
			</td>
			<td>
				<form:input path="area" />
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="details">
					<spring:message text="Any other details" />
				</form:label>
			</td>
			<td>
				<form:input path="details" /></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="Book appointment"/>
			</td>
		</tr>
	</table>
</form:form>