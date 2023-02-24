package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

/**
 * Servlet implementation class DeleteStudent
 */
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
		 int studentId=0;
		try {
			studentId = Integer.parseInt(request.getParameter("id"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 StudentService studentService=new StudentServiceImpl();
		 
		 studentService.delete(studentId);
		 List<Student>studentList=studentService.getListRecords();
	        request.setAttribute("listUser", studentList);
		 request.getRequestDispatcher("ViewList.jsp").forward(request, response);
		 out.print("<html><body><h2>Deleled</h2></body></html>");
	}

	

}
