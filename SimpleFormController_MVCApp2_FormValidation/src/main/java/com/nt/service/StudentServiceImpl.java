package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAOImpl;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
  
	private StudentDAOImpl dao;
	public StudentServiceImpl(StudentDAOImpl dao) {
		this.dao = dao;
	}
	public String register(StudentDTO dto) {
		StudentBO sbo=new StudentBO();
		BeanUtils.copyProperties(dto,sbo);
		int cnt=dao.insert(sbo);
		if(cnt==0)
		return "Registration failed";
		else 
		return "Registration success"; 
	}

}
