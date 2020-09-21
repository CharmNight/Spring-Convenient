package com.night.response;

/**
 * @author night
 */
public interface Result {
	Integer statusCode = null;
	String message = null;
	Object data = null;

	void setStatusCode(Integer statusCode);
	void setMessage(String message);
	void setData(Object data);
}
