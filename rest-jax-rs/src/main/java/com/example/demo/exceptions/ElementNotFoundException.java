package com.example.demo.exceptions;

import jakarta.ws.rs.ext.Provider;

@Provider
public class ElementNotFoundException  {
	private String errorCode;
	private String errorMessage;
	public ElementNotFoundException(String errorCode, String erroeMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = erroeMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErroeMessage() {
		return errorMessage;
	}
	public void setErroeMessage(String erroeMessage) {
		this.errorMessage = erroeMessage;
	}
	

}
