package com.example.prep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends RuntimeException {
	public static final long serialVersionUID=1l;
	public CourseNotFoundException(String messege) {
		super(messege);
	}

}
