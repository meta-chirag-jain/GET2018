package com.metacube.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.metacube.dao.UserDao;
import com.metacube.model.User;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head>");
		out.println("<title>Profile Page</title></head>");
		
		out.println("<body>");
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
	    HttpSession session = httpRequest.getSession(false);
	    
		String email = (String) session.getAttribute("semail");
		
		User user = UserDao.fetchUser(email);
		
		out.println("<form name='logoutForm' action='LogoutServlet' method='POST'>");
		out.println("<table cellspacing='5px' width='100%'>");
		out.println("<tr>");
		out.println("<td align='right'>Welcome " + user.getFirstName().toUpperCase() + "!! <input type='submit' value='Logout'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		
		out.println("<hr><br><br><br><br>");
		
		out.println("<table cellspacing='5px' align='center'>");
		out.println("<tr>");
		out.println("<td>First Name</td><td>" + user.getFirstName().toUpperCase() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Last Name</td><td>" + user.getLastName().toUpperCase() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>DOB</td><td>" + user.getDob() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Age</td><td>" + user.getAge() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Number</td><td>" + user.getNumber() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Email</td><td>" + user.getEmail() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Company</td><td>" + user.getCompany().toUpperCase() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td colspan='2'><a href='EditUserServlet?firstName=" + user.getFirstName() + "&lastName=" + user.getLastName()
				+ "&number=" + user.getNumber() + "&email=" + user.getEmail()
				+ "'>Edit Details</a></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td colspan='2'><a href='FriendsServlet?company=" + user.getCompany() + "'>See Friends</a></td>");
		out.println("</tr>");
		/*for(Employee e : employeeList) {
			out.println("<tr>");
			out.println("<td>" + e.getFirstName() + "</td><td>" + e.getLastName() + "</td><td>" + e.getEmail() + "</td><td>" + e.getAge() + "</td>"
					+ "<td><a href ='EditEmployeeServlet?firstName=" + e.getFirstName() + "&lastName=" + e.getLastName() + "&email=" + e.getEmail() 
					+ "&age=" + e.getAge() + "'>Edit</a></td>");
			out.println("</tr>");				
		}*/
		out.println("</table>");
		
		out.println("<br><br><br><br><hr>");
		out.println("<footer><center>&copy: 2018 | All Rights Reserved | Metacube Training</center></footer>");
				
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
