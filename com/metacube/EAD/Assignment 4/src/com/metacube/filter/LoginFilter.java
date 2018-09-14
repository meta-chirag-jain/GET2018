package com.metacube.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.metacube.dao.UserDao;

public class LoginFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("In Filter");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//System.out.println("result " + UserDao.validateLogin(email, password));
		//out.println("before funcion");
		if(UserDao.validateLogin(email, password))
		{
			//out.println("In if");
		    chain.doFilter(request, response);
		    //out.println("AFter chain");
		}
		else
		{
			//out.println("In else");
			out.print("INVALID LOGIN");
			request.getRequestDispatcher("Login.html").include(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
