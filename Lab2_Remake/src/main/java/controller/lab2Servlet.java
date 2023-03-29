package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lab2Servlet
 */
@WebServlet({ "/lab2Servlet", "/dien-tich", "/chu-vi", "/2in1" })
public class lab2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public lab2Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("message", "hello");
		request.getRequestDispatcher("/views/tamGiac.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double c = Double.parseDouble(request.getParameter("c"));

		if ((a + b > c) && (a + c > b) && (b + c > a)) {

			double chuVi = (a + b + c);
			String uri = request.getRequestURI();

			if (uri.contains("dien-tich")) {

				double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a)) / 4;
				request.setAttribute("message", "Diện tích của tam giác là: " + dienTich);
				request.setAttribute("a", a);
				request.setAttribute("b", b);
				request.setAttribute("c", c);

			} else if (uri.contains("chu-vi")) {
				request.setAttribute("message", "Chu vi của tam giác là: " + chuVi);
				request.setAttribute("a", a);
				request.setAttribute("b", b);
				request.setAttribute("c", c);

			} else {
				double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a)) / 4;
				request.setAttribute("message", "Diện tích của tam giác là: " + dienTich + "<br>Chu vi của tam giác là: " + chuVi);
				request.setAttribute("a", a);
				request.setAttribute("b", b);
				request.setAttribute("c", c);
			}
		} else {

			request.setAttribute("message", "Không thỏa mãn các cạnh của một tam giác!");

		}
		request.getRequestDispatcher("/views/tamGiac.jsp").forward(request, response);
	}

}
