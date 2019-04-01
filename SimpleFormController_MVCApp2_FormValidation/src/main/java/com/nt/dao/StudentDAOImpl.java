package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO{
	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}
	private String INSERT_STUDENT_DETAILS="INSERT INTO STUDENT_TAB VALUES(STU_TAB.NEXTVAL,?,?)";

	public int insert(StudentBO bo) {
		int cnt=jt.update(INSERT_STUDENT_DETAILS,bo.getSname(),bo.getSadd());
		return cnt;
	}
	

}
