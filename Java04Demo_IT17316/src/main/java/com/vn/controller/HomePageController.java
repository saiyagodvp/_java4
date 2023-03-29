package com.vn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.model.Student;

@WebServlet(urlPatterns = { "/index", "/", "" })
public class HomePageController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", "Java04");
		
		
		String fullName = request.getParameter("fullName");
		request.setAttribute("fName", fullName);
		
		request.setAttribute("student", new Student("PH0001", "Ngan", false));
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
