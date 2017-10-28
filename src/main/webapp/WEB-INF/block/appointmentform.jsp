<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" action="appointment/save">
	<table>
		<tr><td><form:label path="name"> Client Name : </form:label>
			</td><td><form:input path="name"></form:input></td>
		</tr>
		<tr><td><form:label path="mobileNum">Mobile No. : </form:label></td>
			<td><form:input path="mobileNum"></form:input></td>
		</tr>
		<tr><td><form:label path="address">Address : </form:label></td>
			<td><form:input path="address"></form:input></td>
		</tr>
		<tr><td><form:label path="area">Property area : </form:label></td>
			<td><form:input path="area"></form:input></td>
		</tr>
		<tr><td><form:label path="details">Any other details: </form:label></td>
			<td><form:input path="details"></form:input></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="Submit"/>
			</td>
		</tr>
	</table>
</form:form>