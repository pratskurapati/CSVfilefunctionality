package com.search.elasticsearch.model;

import lombok.Data;

@Data
public class ErrorResponse {
	private String code;
	private String details;

	public ErrorResponse(String code, String details) {
		this.code = code;
		this.details = details;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
