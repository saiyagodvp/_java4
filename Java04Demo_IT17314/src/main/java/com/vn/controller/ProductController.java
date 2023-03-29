package com.vn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.dao.ProductDAO;
import com.vn.dao.ProductDAOImpl;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	
	private ProductDAO productDAO = new ProductDAOImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("listProducts", productDAO.readAll());
		req.getRequestDispatcher("/product/list.jsp").forward(req, resp);
	}

}
