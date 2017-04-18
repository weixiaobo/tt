package com.lsn.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lsn.web.dao.StudentDao;
import com.lsn.web.entity.Student;
import com.lsn.web.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Resource
	private StudentDao studentDao;

	public Student queryStudent(Integer id) {
		
		return studentDao.queryById(id);
	}

	public void addStudent(Student student) {
		
		studentDao.addStudent(student);
	}
	
	
}
