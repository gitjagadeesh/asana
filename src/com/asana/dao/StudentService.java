package com.asana.dao;

import com.asana.command.Student;

public interface StudentService {
	public String create(Student std);
	public Student search(Student std);

}
