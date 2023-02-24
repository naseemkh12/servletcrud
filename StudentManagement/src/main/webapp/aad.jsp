<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="false"%>
    
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentManagement</title>
</head>
<body>
<form action="StudentController" method="post">
<h3 style="center">User Management Application</h3>
<table>
<tr>
<td>FirstName</td><td><input type="text" name="fname"></td>
<td>LName</td><td><input type="text" name="lname"></td>
</tr>
<tr>
<td>Email</td><td><input type="text" name="email"></td>
<td>Address</td><td><input type="text" name="address"></td>
  <td colspan="2" align="center">
              <input type="submit" value="Save"></td>
            </tr>
</table>
<a href="ViewList">View Student</a>
  
</form>
</body>
</html>