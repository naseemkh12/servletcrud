<%@page import="studentManagement.been.StudentManagementbeen"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	<center>
		<h2>Student Managements List</h2>
		<a href="Registration.jsp">Add</a>
		</td>
		</td>
	</center>

	<table>
		<tr>
		   <th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>RollNo</th>
			<th>Adress</th>
			<th>Action</th>

		</tr>
		<tr>
			<%
			ArrayList<StudentManagementbeen> std = (ArrayList<StudentManagementbeen>) request.getAttribute("list");
			for (StudentManagementbeen s : std) {
			%>
            
            <td><%=s.getId()%></td>
			<td><%=s.getName()%></td>
			<td><%=s.getEmail()%></td>
			<td><%=s.getPassword()%></td>
			<td><%=s.getRoolNo()%></td>
			<td><%=s.getAddress()%></td>
			<td><a href="DeleteController?id=<%=s.getId()%>">Delete</a>
			<a href="EditController?id=<%=s.getId()%>">Edit</a>
			
			</td>
		</tr>
		<%
		}
		%>


		</tr>


	</table>

</body>
</html>
