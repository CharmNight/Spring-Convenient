package com.night.response.ResultBean;


/**
 *
 * 默认的Response 返回格式
 *
 * 所有 返回必须 实现{@link Result}
 *
 * @author night
 */
public class FrameworkResult implements Result {
	private Integer statusCode;
	private String message;
	private Object data;
	private PageResult pagination;

	public Integer getStatusCode() {
		return statusCode;
	}

	@Override
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	@Override
	public void setData(Object data) {
		this.data = data;
	}

	public PageResult getPagination() {
		return pagination;
	}

	@Override
	public void setPagination(PageResult pagination) {
		this.pagination = pagination;
	}
}
