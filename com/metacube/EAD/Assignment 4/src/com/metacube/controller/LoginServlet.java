package com.metacube.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("In Servlet");
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head>");
//		out.println("<meta http-equiv='Refresh' content='7; url=Profile.html'>");
		out.println("<title>Login Page</title></head>");
		
		out.println("<body>");
		
		out.println("Login Successful");
		
		String email = request.getParameter("email");
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
	    HttpSession session = httpRequest.getSession();
	    
	    session.setAttribute("semail", email);
	    
		RequestDispatcher requestdispatch = request.getRequestDispatcher("/ProfileServlet");
		requestdispatch.include(request, response);
				
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
