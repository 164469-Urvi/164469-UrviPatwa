package com.urvi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.urvi.dao.InvalidUserException;
import com.urvi.dao.UserDAO;


@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName,password;
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		
		String usertype=null;
		PrintWriter out=response.getWriter();
		try{
			usertype=getUserType(userName,password);
		}catch(InvalidUserException e)
		{
			out.print("<h1>invalid user</h1>");
		}
		
		
	RequestDispatcher requestdispatcher =null;
		if(usertype.equals("Admin"))
		{ 	requestdispatcher=request.getRequestDispatcher("/AdminServlet");
			
		}
		else if(usertype.equals("User"))
				{
			requestdispatcher=request.getRequestDispatcher("/UserServlet");
					}
		else
		{
			requestdispatcher=request.getRequestDispatcher("/InvalidServlet");
			
		}
		requestdispatcher.forward(request,response);
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
private String getUserType(String userName,String password)
{
	UserDAO dao=new UserDAO();
	return dao.getUserType(userName, password);
	
}
}
