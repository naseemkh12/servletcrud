package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DB.packages.DBClass;
import com.util.packages.DaoClass;
import com.util.packages.DaoInterface;

import studentManagement.been.StudentManagementbeen;


@WebServlet("/EditController")
public class EditController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
          throws ServletException, IOException{
		String sid=request.getParameter("id");
	      int id=Integer.parseInt(sid);
	 System.out.println("jjsgdsgfete"+id);
	 DaoInterface daoInterface =new DaoClass();
	 StudentManagementbeen byId= daoInterface.getEmployeeById(id); 
	 
	 System.out.println(byId);
	 request.setAttribute("byId", byId);
	    RequestDispatcher requestDispatcher=request.getRequestDispatcher("editform.jsp");
	    requestDispatcher.forward(request, response);
	
	 
	 
	 
	 
	
				
				
			}
			
			
			
	     
	      
	}	


