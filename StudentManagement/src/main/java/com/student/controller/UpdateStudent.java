package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

/**
 * Servlet implementation class UpdateStudent
 */
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				 PrintWriter out=response.getWriter();
				 int studentId=0;
				try {
					studentId = Integer.parseInt(request.getParameter("id"));
					 StudentService studentService=new StudentServiceImpl();
					 Student student=studentService.findById(studentId);
					 request.setAttribute("studentId", studentId);
					 request.setAttribute("fName", student.getFirstName());
					 request.setAttribute("lname",student.getLastName());
					 request.setAttribute("email", student.getEmail());
					 request.setAttribute("address", student.getAddress());
					 System.out.println(student);
					 
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.getRequestDispatcher("update.jsp").forward(request, response);
				 out.print("<html><body><h2>update</h2></body></html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id =Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		System.out.println("address " +fname);
		
		System.out.println("address " +address);
		Student st=new Student();
		st.setId(id);
		st.setFirstName(fname);
		st.setLastName(lname);
		st.setEmail(email);
		st.setAddress(address);
            StudentService studentService=new StudentServiceImpl();
            //save records
            studentService.updateStudent(st);
            RequestDispatcher dispatcher = request.getRequestDispatcher("aad.jsp");
            dispatcher.forward(request, response);
	}

}
