package com.gpay.user_service.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends ApplicationException{

	public UserNotFoundException(String userId) {
		super(
				"USER_NOT_FOUND",
				"User with ID " + userId + " not found",
				HttpStatus.NOT_FOUND
		);
	}

}
