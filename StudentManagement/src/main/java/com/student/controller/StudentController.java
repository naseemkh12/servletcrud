package com.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentController
 */

public class StudentController extends HttpServlet {
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		System.out.println("address " +fname);
		
		System.out.println("address " +address);
		Student st=new Student();
		st.setFirstName(lname);
		st.setLastName(lname);
		st.setEmail(email);
		st.setAddress(address);
            StudentService studentService=new StudentServiceImpl();
            //save records
            studentService.saveRecords(st);
            RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
            dispatcher.forward(request, response);
            
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 // fetch the data from service
		StudentService studentService=new StudentServiceImpl();
        List<Student>studentList=studentService.getListRecords();
        request.setAttribute("listUser", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewList.jsp");
        dispatcher.forward(request, response);
	}
	

}