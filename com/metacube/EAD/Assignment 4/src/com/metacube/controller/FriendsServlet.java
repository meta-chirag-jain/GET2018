package com.metacube.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.metacube.dao.UserDao;
import com.metacube.model.User;

public class FriendsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head>");
		out.println("<title>Friend Page</title></head>");
		
		out.println("<body>");
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
	    HttpSession session = httpRequest.getSession(false);
	    
		String email = (String) session.getAttribute("semail");
		
		String company = request.getParameter("company");
		List<User> friends = UserDao.fetchFriends(email, company);
		
		out.println("<form name='logoutForm' action='LogoutServlet' method='POST'>");
		out.println("<table cellspacing='5px' width='100%'>");
		out.println("<tr>");
		out.println("<td align='right'><input type='submit' value='Logout'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		
		out.println("<hr><br><br><br><br>");
		
		out.println("<table cellspacing='5px' align='center'>");
		out.println("<td>Name</td><td>Age</td><td>Email</td><td></td>");
		out.println("</tr>");
		for(User friend : friends) {
			out.println("<tr>");
			out.println("<td>" + friend.getFirstName() + " " + friend.getLastName() + "</td><td>" + friend.getAge() + "</td>"
					+ "<td><a href ='FriendProfileServlet?email=" + friend.getEmail() + "'>" + friend.getEmail() + "</a></td>");
			out.println("</tr>");				
		}
		out.println("</table>");
		
		out.println("<br><br><br><br><hr>");
		out.println("<footer><center>&copy: 2018 | All Rights Reserved | Metacube Training</center></footer>");
				
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
