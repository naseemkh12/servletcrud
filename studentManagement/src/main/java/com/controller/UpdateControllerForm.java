package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.packages.DaoClass;
import com.util.packages.DaoInterface;

import studentManagement.been.StudentManagementbeen;


@WebServlet("/UpdateControllerForm")
public class UpdateControllerForm extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("upadte the code ");	


String sid = request.getParameter("id");
int id=Integer.parseInt(sid);

String name = request.getParameter("name");
String email = request.getParameter("email");
String password = request.getParameter("password");
String rollNo = request.getParameter("rollNo");
String address = request.getParameter("address");
StudentManagementbeen been = new StudentManagementbeen();
System.out.println(" i am hitting request get of controller comming id " +id);
System.out.println(" i am hitting request get of controller comming name " +name);
System.out.println(" i am hitting request get of controller comming email" +email);
System.out.println(" i am hitting request get of controller comming pasword" +password);
System.out.println(" i am hitting request get of controller comming Roll No" +rollNo);
System.out.println(" i am hitting request get of controller comminghieyewr Address " +address);
been.setId(id);
been.setName(name);
been.setEmail(email);
been.setPassword(password);
been.setRoolNo(rollNo);
been.setAddress(address);
DaoInterface daoInterface =new DaoClass();
 int i= daoInterface.update(been);
 if( i>0) {
	 System.out.println("data has been upadted ");
	 response.sendRedirect("viewsController");
	 
 }
 else {
	 System.out.println("not Upadted The data");
	 
 }
 




	}
	
	}


