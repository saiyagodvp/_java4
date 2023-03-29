package com.vn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//TODO check login with DB
		if("huypn".equals(username) && "huypn".equals(password)) {
			//TODO remove fake
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setFullName("Huy Pham");
			
			request.getSession().setAttribute("userLogged", user);
			
			response.sendRedirect(request.getContextPath());
			
		} else {
			
		}
		
		response.getWriter().print("<p>" + username + "</p>");
	}

}
