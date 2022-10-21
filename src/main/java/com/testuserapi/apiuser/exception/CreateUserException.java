package com.testuserapi.apiuser.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Seul user avec pays : France ")
public class CreateUserException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreateUserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


}
