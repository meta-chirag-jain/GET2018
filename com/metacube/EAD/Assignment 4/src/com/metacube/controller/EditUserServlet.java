package com.metacube.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head>"
				+ "<title>Edit User</title>"
				+ "<script  src='scripts/validate.js'></script>"
				+ "</head>");
		out.println("<body>");
		
		out.println("<form name='userEditForm' action='UpdateUserServlet'>");
		out.println("<table cellspacing='5px'>");
		out.println("<tr>");
		out.println("<td>First Name</td><td><input type='text' name='firstName' value='" + request.getParameter("firstName") + "' required onkeyup='validateFirstName()'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Last Name</td><td><input type='text' name='lastName' value='" + request.getParameter("lastName") + "' required onkeyup='validateLastName()'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Number</td><td><input type='text' name='number' value='" + request.getParameter("number") + "' required onkeyup='validateNumber()'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Email</td><td><input type='text' name='email' value='" + request.getParameter("email") + "' required onkeyup='validateEmail()'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td></td><td><input type='hidden' name='oldEmail' value='" + request.getParameter("email") + "'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td colspan='2'><input type='submit' value='Update'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		
		out.println("<p><a href= 'ProfileServlet'>BACK</a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
