package com.lsn.web.service;

import com.lsn.web.entity.Student;


public interface StudentService {

	
	public Student queryStudent(Integer id);
	public void addStudent(Student student);
}
