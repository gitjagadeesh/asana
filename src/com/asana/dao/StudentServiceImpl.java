package com.asana.dao;

import com.asana.command.Student;
import com.asana.factory.ConnectionFactory;
import java.sql.*;

public class StudentServiceImpl implements StudentService {

	
	public String create(Student std) {
		String status="";
		  try
		  {
			Connection con=ConnectionFactory.getConnection(); 
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?)");
			pst.setString(1, std.getSname());
			pst.setString(2,std.getSemail());
			pst.setString(3, std.getPhoneno());
			pst.setString(4,std.getPassword());
			int rowCount=pst.executeUpdate();
			if(rowCount==1)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		return status;
	}

	
	public Student search(Student std) {
		Student std1=null;
		try
		{
			 std1=new Student();
			Connection con=ConnectionFactory.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from student where semail=? and password=?");
			pst.setString(1, std.getSemail());
			pst.setString(2, std.getPassword());
			ResultSet rs=pst.executeQuery();
			boolean b=rs.next();
			if(b==true)
			{
				std1.setSname(std.getSname());
				std1.setSemail(std.getSemail());
				std1.setPhoneno(std.getPhoneno());
				std1.setPassword(std.getPassword());
			}
			else
			{
				std1=null;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return std1;
	}

}
