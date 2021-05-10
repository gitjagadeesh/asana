package com.asana.factory;

import com.asana.dao.StudentService;
import com.asana.dao.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService stdService;
	static
	{
		stdService=new StudentServiceImpl();
	}
	public static StudentService getStudentService()
	{
		return stdService;
	}
	

}
