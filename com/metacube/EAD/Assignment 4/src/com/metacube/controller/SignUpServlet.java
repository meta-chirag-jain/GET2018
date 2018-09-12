package com.metacube.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacube.dao.UserDao;
import com.metacube.model.User;

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Date dob = null;
		try {
			dob = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String company = request.getParameter("company");
		
		User user= new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setDob(dob);
		user.setNumber(number);
		user.setEmail(email);
		user.setPassword(password);
		user.setCompany(company);
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html><head><meta http-equiv='Refresh' content='5; url=Login.html'><title>SignUp Status</title></head>");
		out.println("<body>");
		
		out.println(UserDao.addUser(user));
		
		/*if(UserDao.addUser(user) == Status.INSERTED) {
			out.println(UserDao.addUser(user) + "<p>Added successfully</p>");
		} else {
			out.println("<p>!!ERROR!!</p>");
		}*/
		
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
