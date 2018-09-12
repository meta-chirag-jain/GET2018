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

public class ShowEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head><title>Show Employee</title></head>");
		//out.println("");
		out.println("<body>");
		
		List<Employee> employeeList = DataAccessObject.showEmployees();
		
		if(employeeList == null) {
			out.println("<p>No Employee</p>");
		} else {
			out.println("<table cellspacing='5px'>");
			out.println("<tr>");
			out.println("<td>First Name</td><td>Last Name</td><td>Email</td><td>Age</td><td></td>");
			out.println("</tr>");
			for(Employee e : employeeList) {
				out.println("<tr>");
				out.println("<td>" + e.getFirstName() + "</td><td>" + e.getLastName() + "</td><td>" + e.getEmail() + "</td><td>" + e.getAge() + "</td>"
						+ "<td><a href ='EditEmployeeServlet?firstName=" + e.getFirstName() + "&lastName=" + e.getLastName() + "&email=" + e.getEmail() 
						+ "&age=" + e.getAge() + "'>Edit</a></td>");
				out.println("</tr>");				
			}
			out.println("</table>");
		}
		
		out.println("<p><a href= 'http://localhost:8080/EAD_Assignment_3/'>BACK</a></p>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}