package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/scope-test")
public class scopeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public scopeTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("x", 10);
		req.getRequestDispatcher("scopeTest.jsp").forward(req, resp);
	}

}
