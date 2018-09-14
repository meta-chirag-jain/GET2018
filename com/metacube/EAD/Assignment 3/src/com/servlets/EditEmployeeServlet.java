package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DataAccessObject;
import com.pojo.Employee;

public class EditEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head><title>Show Employee</title></head>");
		//out.println("");
		out.println("<body>");
		
		out.println("<form name='employeeEditForm' action='UpdateEmployeeServlet'>");
		out.println("<table cellspacing='5px'>");
		out.println("<tr>");
		out.println("<td>First Name</td><td><input type='text' name='firstName' value='" + request.getParameter("firstName") + "'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Last Name</td><td><input type='text' name='lastName' value='" + request.getParameter("lastName") + "'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Email</td><td><input type='text' name='email' value='" + request.getParameter("email") + "'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Age</td><td><input type='number' name='age' value='" + (Integer.parseInt(request.getParameter("age"))) + "'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td></td><td><input type='hidden' name='oldEmail' value='" + request.getParameter("email") + "'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td colspan='2'><input type='submit' value='Update'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		
		out.println("<p><a href= 'http://localhost:8080/EAD_Assignment_3/ShowEmployeesServlet'>BACK</a></p>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
