package com.asana.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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


@WebServlet("/loginregister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String email=request.getParameter("email");
	  String password=request.getParameter("password");
	  Cookie [] c=request.getCookies();
	   String name= c[0].getValue();
	   String phoneno=c[1].getValue();
	   Student std=new Student();
	   std.setSname(name);
	   std.setSemail(email);
	   std.setPhoneno(phoneno);
	   std.setPassword(password);
	  StudentService stdService=StudentServiceFactory.getStudentService();
	  std=stdService.search(std);
	  RequestDispatcher rd=null;
	  if(std==null)
	  {
		  rd=request.getRequestDispatcher("status.jsp");
		  rd.forward(request,response);
	  }
	  else
	  {
		  rd=request.getRequestDispatcher("login.jsp");
		  rd.forward(request, response);
	  }
	 
	}

}
