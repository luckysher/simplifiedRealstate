<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>	
	<form:form method="post" commandName="appointment" action="save">
		<table>
			<tr>
				<td width="30%"><span class="form-label">Client Name</span></td>
				<td width="70%"><form:input path="name" /></td>
			</tr>
			<tr>			
				<td colspan="2"><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td width="30%"><span class="form-label">Mobile number</span></td>
				<td width="70%"><form:input path="mobileNum" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:errors path="mobileNum" cssClass="error" /></td>
			</tr>
			<tr>
				<td width="30%"><span class="form-label">Address</span></td>
				<td width="70%"><form:input path="address" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:errors path="address" cssClass="error" /></td>
			</tr>
			<tr>
				<td width="30%"><span class="form-label">Area</span></td>
				<td width="70%"><form:input path="area" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:errors path="area" cssClass="error" /></td>
			</tr>
			<tr>
				<td width="30%"><span class="form-label">Details</span></td>
				<td width="70%"><form:input path="details" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:errors path="details" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2" class="sub-but-container">
					<center>
						<input type="submit" value="Book appointment" class="appointment-button"/>
					</center>
				</td>
			</tr>
		</table>
	</form:form>
</center>