package com.vn.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	
	public RegisterController() {
		System.out.println("1.Constructor run....");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("2.init run....");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("3.service run....");
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("3-doGet run....");
		req.getRequestDispatcher("register.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("3-doPost run....");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String fullName = req.getParameter("fullName");
		String[] hb = req.getParameterValues("hobbies");
		
		//TODO register user to Database
		System.out.println(username +  " " + password + " hobbies: " + Arrays.toString(hb));
		
	}
	
	@Override
	public void destroy() {
		System.out.println("4-destroy run....");
		super.destroy();
	}

}
