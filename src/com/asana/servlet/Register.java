package com.asana.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asana.command.Student;
import com.asana.dao.StudentService;
import com.asana.factory.StudentServiceFactory;


@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname=request.getParameter("name");
		String semail=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String password=request.getParameter("password");
		Student std=new Student();
		std.setSname(sname);
		std.setSemail(semail);
		std.setPhoneno(phoneno);
		std.setPassword(password);
		Cookie c1=new Cookie("sname",sname);
		Cookie c2=new Cookie("phoneno",phoneno);
		response.addCookie(c1);
		response.addCookie(c2);
		
		StudentService stdService=StudentServiceFactory.getStudentService();
		String status=stdService.create(std);
		if(status.equals("success"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
	}

}
