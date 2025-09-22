package com.gpay.user_service.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<?> handleApplicationException(final ApplicationException exception, final HttpServletRequest request){
		var guid = UUID.randomUUID().toString();

		var response = new ApiErrorResponse(
				guid,
				exception.getErrorCode(),
				exception.getMessage(),
				String.valueOf(exception.getHttpStatus().value()),
				exception.getHttpStatus().name(),
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now()
		);
		return new ResponseEntity<>(response, exception.getHttpStatus());
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleUnknownException(final Exception exception, final HttpServletRequest request){
		var guid = UUID.randomUUID().toString();

		List<String> errors = new ArrayList<>();
		errors.add(exception.getMessage());

		for(Throwable suppressed: exception.getSuppressed()){
			errors.add(suppressed.getMessage());
		}

		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

		var response = new ApiErrorResponse(
				guid,
				"UNKNOWN_ERROR",
				"An unexpected error occurred",
				String.valueOf(status.value()),
				status.name(),
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				errors
		);

		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException ex,
//													   HttpServletRequest request) {
//		var guid = UUID.randomUUID().toString();
//
//		// Collect all validation error messages
//		List<String> errors = ex.getBindingResult()
//				.getFieldErrors()
//				.stream()
//				.map(FieldError::getDefaultMessage)
//				.toList();
//
//		var response = new ApiErrorResponse(
//				guid,
//				"VALIDATION_FAILED",
//				"Validation error occurred",
//				String.valueOf(HttpStatus.BAD_REQUEST.value()),
//				HttpStatus.BAD_REQUEST.name(),
//				request.getRequestURI(),
//				request.getMethod(),
//				LocalDateTime.now(),
//				errors
//		);
//
//		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//	}


}
