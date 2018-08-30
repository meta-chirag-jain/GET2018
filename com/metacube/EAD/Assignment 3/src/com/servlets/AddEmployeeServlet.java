package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DataAccessObject;
import com.pojo.Employee;

public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		int age = (Integer.parseInt(request.getParameter("age")));

		Employee employee= new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setEmail(email);
		employee.setAge(age);
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head><title>Add Employee</title></head>");
		out.println("<body>");
		
		if(DataAccessObject.addEmployee(employee) == 1) {
			out.println("<p>Added successfully</p>");
		} else {
			out.println("<p>!!ERROR!!</p>");
		}
		
		out.println("<p><a href= 'http://localhost:8080/EAD_Assignment_3/'>BACK</a></p>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
