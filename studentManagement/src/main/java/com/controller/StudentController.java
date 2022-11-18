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

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sid = request.getParameter("id");
		 int id=Integer.parseInt(sid);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String rollNo = request.getParameter("rollNo");
		String address = request.getParameter("address");
		StudentManagementbeen been = new StudentManagementbeen();
		System.out.println(" i am hitting request get of controller comming " +name);
		System.out.println(" i am hitting request get of controller comming " +email);
		System.out.println(" i am hitting request get of controller comming " +password);
		System.out.println(" i am hitting request get of controller comming " +rollNo);
		System.out.println(" i am hitting request get of controller comming " +address);
		been.setId(id);
		been.setName(name);
		been.setEmail(email);
		been.setPassword(password);
		been.setRoolNo(rollNo);
		been.setAddress(address);
		
		DaoInterface daoInterface =new DaoClass();
		daoInterface.insert(been);
		response.sendRedirect("viewsController");
		
		
	}

}
