package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.tuiXachDAO;
import dao.tuiXachDAOimpl;
import model.tuiXach;

@WebServlet({ "/tuiXach/update", "/sua" })
public class updateTuiXach extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private tuiXachDAO tuiXachDAO = new tuiXachDAOimpl();

	public updateTuiXach() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		tuiXach t = tuiXachDAO.readById(id);
		request.setAttribute("idTX", t.getId_TuiXach());
		request.setAttribute("tenTX", t.getTenTuiXach());
		request.setAttribute("mauTX", t.getMauSac());
		request.setAttribute("giaTX", t.getGiaTien());
		request.setAttribute("ghiChuTX", t.getGhiChu());
		request.getRequestDispatcher("/tuiXach/updateTuiXach.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idTXX = request.getParameter("idTX");
		int id = Integer.parseInt(idTXX);
		String tenTuiXach = request.getParameter("tenTuiXach");
		String mauSac = request.getParameter("mauSac");
		String giaTien = request.getParameter("giaTien");
		String ghiChu = request.getParameter("ghiChu");

		request.setAttribute("tenTX", tenTuiXach);
		request.setAttribute("mauTX", mauSac);
		request.setAttribute("giaTX", giaTien);
		request.setAttribute("ghiChuTX", ghiChu);
		String uri = request.getRequestURI();
		if (uri.contains("sua")) {
			tuiXachDAO txDao = new tuiXachDAOimpl();
			tuiXach t = new tuiXach(id, tenTuiXach, mauSac, giaTien, ghiChu);
			request.setAttribute("message",
					"ID: " + id + "<br>Ten: " + t.getTenTuiXach() + "<br>Màu Sắc:" + t.getMauSac()
							+ "<br>Giá Tiền: " + t.getGiaTien() + "<br>Ghi Chú: " + t.getGhiChu());
			txDao.sua(t);

		}

		request.setAttribute("listTuiXach", tuiXachDAO.getAll());

		request.getRequestDispatcher("/tuiXach/listTuiXach.jsp").forward(request, response);

	}

}
