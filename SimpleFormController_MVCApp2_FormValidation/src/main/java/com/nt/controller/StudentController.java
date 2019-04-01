package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentServiceImpl;


public class StudentController extends SimpleFormController {
	private StudentServiceImpl service;

	public StudentController(StudentServiceImpl service) {
		this.service = service;
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd=(StudentCommand) command;
		//convert command to DTO obj
		StudentDTO dto=new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		String result=service.register(dto);
		return new ModelAndView(this.getSuccessView(),"resMsg",result);
	}
	

}
