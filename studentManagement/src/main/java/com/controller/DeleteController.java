package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.packages.DaoClass;
import com.util.packages.DaoInterface;


@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	

	protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
          throws ServletException, IOException
{
		
		System.out.println("on click delete hit the controller");
		
		String idiString =request.getParameter("id");
		int id = Integer.parseInt(idiString);
		
		System.out.println("jva isissa"+id);
	        
	        System.out.println("Idhioeyre"+id);
	        DaoInterface daoInterface =new DaoClass();
	        daoInterface.delete(id);  
	        response.sendRedirect("viewsController");  
		
		
	}

}
