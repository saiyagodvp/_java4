package com.vn.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.model.Student;

@WebServlet("/student")
public class StudentController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//TODO get students from DB
		List<Student> students = new ArrayList<>();
		students.add(new Student("ph00001", "Pham Van Teo", true));
		students.add(new Student("ph00002", "Pham Thi To", false));
		students.add(new Student("ph00003", "Pham Van A", true));
		
		req.setAttribute("studentList", students);
		req.getRequestDispatcher("student/list.jsp").forward(req, resp);
		
	}
	

}
