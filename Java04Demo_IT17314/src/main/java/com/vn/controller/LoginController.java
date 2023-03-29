package com.vn.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1625451326699215067L;
	
	public LoginController() {
		System.out.println("constructor run....");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init run....");
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service run....");
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet run....");
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost run....");
		//1 get param from request
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		
		String[] system = req.getParameterValues("system");
		System.out.println(Arrays.toString(system));
		
		//validate
		boolean hasError = false;
		if(uname == null || "".equals(uname)) {
			req.setAttribute("error_username", "Username must be not blank");
			hasError = true;
		}
		
		if(pass == null || "".equals(pass)) {
			req.setAttribute("error_pass", "Password must be not blank");
			hasError = true;
		}
		
		//stop
		if(hasError) {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			return;
		}
		
		//check login with Database
		if(checkLogin(uname, pass)) {
			//TODO save user logged
			
			resp.sendRedirect(req.getContextPath() + "/index");
		} else {
			req.setAttribute("error_acc", "Username or password incorrect");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy run....");
		super.destroy();
	}

	private boolean checkLogin(String uname, String pass) {
		return uname.equals("huypn") && pass.equals("huypn");
	}
}
