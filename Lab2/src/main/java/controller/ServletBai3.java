package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bai3")
public class ServletBai3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletBai3() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/bai3.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gioiTinh = request.getParameter("gioiTinh");
		String married = request.getParameter("married");
		String country = request.getParameter("country");
		String ghiChu = request.getParameter("ghiChu");

		String[] getSoThich = request.getParameterValues("soThich");

		StringBuilder sb = new StringBuilder();
		for (String item : getSoThich) {
			{
				sb.append(item).append(", ");
			}
		}

		String soThichConverted = "";
		if (sb.toString() != "") {
			soThichConverted = sb.toString().substring(0, sb.toString().lastIndexOf(",")) + ".";
		}
		String maritalStatus = "";
		if (married == null) {
			maritalStatus = "Kênh Chat FA";
		} else {
			maritalStatus = married;
		}

		request.setAttribute("username", "User Name: " + username);
		request.setAttribute("password", "Password: " + password);
		request.setAttribute("gioiTinh", "Giới Tính: " + gioiTinh);
		request.setAttribute("married", "Trạng Thái FA: " + maritalStatus);
		request.setAttribute("country", "Quốc Tịch: " + country);
		request.setAttribute("ghiChu", "Ghi Chú: " + ghiChu);
		
		request.setAttribute("soThich", "Sở Thích: " + soThichConverted);
		
		System.out.println(username + password + gioiTinh + maritalStatus + country + soThichConverted + ghiChu);
		request.getRequestDispatcher("/views/result_Bai3.jsp").forward(request, response);
	}

}
