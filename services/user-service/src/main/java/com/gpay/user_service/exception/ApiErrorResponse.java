package com.gpay.user_service.exception;

import java.time.LocalDateTime;
import java.util.List;


public class ApiErrorResponse {

	private String guid;
	private String errorCode;
	private String message;
	private String statusCode;
	private String statusName;
	private String path;
	private String method;
	private LocalDateTime timeStamp;
	private List<String> errors;

	// Constructor without errors
	public ApiErrorResponse(String guid, String errorCode, String message, String statusCode, String statusName,String path, String method, LocalDateTime timeStamp) {
		this.guid = guid;
		this.errorCode = errorCode;
		this.message = message;
		this.statusCode = statusCode;
		this.statusName = statusName;
		this.path = path;
		this.method = method;
		this.timeStamp = timeStamp;
	}

	// Constructor with errors
	public ApiErrorResponse(String guid, String errorCode, String message, String statusCode, String statusName,String path, String method, LocalDateTime timeStamp, List<String> errors) {
		this.guid = guid;
		this.errorCode = errorCode;
		this.message = message;
		this.statusCode = statusCode;
		this.statusName = statusName;
		this.path = path;
		this.method = method;
		this.timeStamp = timeStamp;
		this.errors = errors;
	}
}



//import lombok.Data;
//import java.time.LocalDateTime;

//@Data
//public class ApiErrorResponse {
//	private final String guid;
//	private final String errorCode;
//	private final String message;
//	private final Integer statusCode;
//	private final String statusName;
//	private final String path;
//	private final String method;
//	private final LocalDateTime timestamp;
//}

//@Value
//public class ApiErrorResponse {
//	String guid;
//	String errorCode;
//	String message;
//	Integer statusCode;
//	String statusName;
//	String path;
//	String method;
//	LocalDateTime timestamp;
//	List<String> errors;
//}

