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

@WebServlet("/viewsController")
public class ViewsController extends HttpServlet {
	protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
          throws ServletException, IOException{
		System.out.println("kjsdkhuyewryeryyereu");
		DaoInterface daoInterface =new DaoClass();
         
    List<StudentManagementbeen> list1= 	daoInterface.list();
    System.out.println(list1);
    request.setAttribute("list", list1);
    RequestDispatcher requestDispatcher=request.getRequestDispatcher("viewList.jsp");
    requestDispatcher.forward(request, response);
	}	

}

