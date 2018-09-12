package com.metacube.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metacube.dao.UserDao;
import com.metacube.model.User;

public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		String oldEmail = request.getParameter("oldEmail");
		
		User user= new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setNumber(number);
		user.setEmail(email);
		
		UserDao.updateUser(user, oldEmail);

		request.getRequestDispatcher("ProfileServlet").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
