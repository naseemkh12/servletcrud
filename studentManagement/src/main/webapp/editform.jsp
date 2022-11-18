<%@page import="studentManagement.been.StudentManagementbeen"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>
.container {
	width: 40%;
	border: 4px solid black;
}
</style>
</head>
<body>
<center>
<h1 style="color:Green">Edit The Record Form</h1>

        <div class="container">
		  
		<form action="UpdateControllerForm" method="post">
			<table>
			<tr>

					<td><input type="hidden" name="id" value="<%= ((StudentManagementbeen) request.getAttribute("byId")).getId() %>" />
						</td>
				</tr>
			
				<tr>
					
					<td>Name:<input type="text" name="name" value="<%= ((StudentManagementbeen) request.getAttribute("byId")).getName() %>" /></td>
				</tr>

				<tr>
			
					<td> Email:<input type="text" name="email" value="<%= ((StudentManagementbeen) request.getAttribute("byId")).getEmail() %>" /></td>
				</tr>

				<tr>
					
					<td>Password:<input type="password" name="password" value="<%= ((StudentManagementbeen) request.getAttribute("byId")).getPassword() %>" /></td>
				</tr>
				<tr>
					
					<td>RollNo:<input type="text" name="rollNo" value="<%= ((StudentManagementbeen) request.getAttribute("byId")).getRoolNo()%>" /></td>
				</tr>
				
				<tr>
				<td>Address:<input type="text" name="address" value="<%= ((StudentManagementbeen) request.getAttribute("byId")).getAddress()%>" /></td>
				

				</tr>


				<td>
			
					<button type="submit">Update</button>
					

				</td>
					


			</table>
		
	</div>    
          
	
			</form>
			</center>

</body>
</html>