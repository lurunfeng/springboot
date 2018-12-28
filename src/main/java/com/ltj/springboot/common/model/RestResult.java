package com.ltj.springboot.common.model;

import java.io.Serializable;

import com.ltj.springboot.common.enums.ErrorTypeEnum;

public class RestResult<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8128344562253653782L;
	private Boolean status = true;
	private String errorMessage;
	private ErrorTypeEnum errorType;
	private T data;

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ErrorTypeEnum getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorTypeEnum errorType) {
		this.errorType = errorType;
	}

}
