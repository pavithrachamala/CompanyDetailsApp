package com.employeedetails.web.controller.exceptions;

import java.time.LocalDateTime;

public class ErrorDetails {
	private String message;
	private LocalDateTime timeStamp;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", timeStamp=" + timeStamp + "]";
	}

	public ErrorDetails(String message, LocalDateTime timeStamp) {
		this.message = message;
		this.timeStamp = timeStamp;
	}

}
