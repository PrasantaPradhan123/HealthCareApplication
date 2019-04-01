package com.nt.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

public class StudentValidator implements Validator {

	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(StudentCommand.class);
	}

	public void validate(Object target, Errors errors) {
		//type casting
		StudentCommand cmd=(StudentCommand) target;
		//form validation
		if(cmd.getSname().equals("") || cmd.getSname()==null) {
			errors.rejectValue("sname", "sname.required");
		}
		else if(cmd.getSname().length()>10){
				errors.rejectValue("sname", "sname.invalid");
			}
		if(cmd.getSadd().equals("") || cmd.getSadd()==null) {
			errors.rejectValue("sadd", "sadd.required");
		}
		
		else if(cmd.getSadd().length()>10){
				errors.rejectValue("sadd", "sadd.invalid");
			}
	}
	
	

}
