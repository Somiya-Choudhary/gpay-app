package com.gpay.user_service.exception;

import org.springframework.http.HttpStatus;

public class BusinessNotFoundException extends ApplicationException{

	public BusinessNotFoundException(String businessId){
		super(
				"BUSINESS_NOT_FOUND",
				"Business with ID " + businessId + " not found",
				HttpStatus.NOT_FOUND
		);
	}
}
