package com.employeedetails.web.controller.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.employeedetails.exceptionhandler.EmployeeNotFoundException;

@ControllerAdvice
@RestController
public class ExceptionHandlerController {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleEmployeeNotFoundException(EmployeeNotFoundException ex, WebRequest req) {
		ErrorDetails details = new ErrorDetails(ex.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> allException(Exception ex, WebRequest req) {
		ErrorDetails details = new ErrorDetails("something is un clear", LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
