<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<table border="1" cellpadding="5">
      <caption><h2>List of Users</h2></caption>
      
<tr>
<th>id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Address</th>
<th>Action</th>
</tr>
         <c:forEach var="user" items="${listUser}">
<tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.firstName}" /></td>
                    <td><c:out value="${user.lastName}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.address}" /></td>
                    <td><a href="edit?id=<c:out value='${user.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
                    
                    
           
</tr>
</c:forEach>
</table>
</form>
</body>
</html>