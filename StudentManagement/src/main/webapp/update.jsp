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
<form action="updateStudentCtl" method="post">
<h3 style="center">User Management Application</h3>

<table>
<tr><td>id</td><td><input type="text" hidden="true" name="id" value="<%=request.getAttribute("studentId") %>"></td></tr>
<tr>
<td>FirstName</td><td><input type="text" name="fname" value="<%=request.getAttribute("fName") %>"></td>
<td>LName</td><td><input type="text" name="lname" value="<%=request.getAttribute("lname") %>"></td>
</tr>
<tr>
<td>Email</td><td><input type="text" name="email" value="<%=request.getAttribute("email") %>"></td>
<td>Address</td><td><input type="text" name="address" value="<%=request.getAttribute("address") %>"></td>
  <td colspan="2" align="center">
              <input type="submit" value="update"></td>
            </tr>
</table>

  
</form>
</body>
</html>