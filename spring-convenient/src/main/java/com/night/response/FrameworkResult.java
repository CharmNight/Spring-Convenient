package com.night.response;


import lombok.Getter;
import lombok.Setter;

/**
 *
 * 默认的Response 返回格式
 *
 * @author night
 */
@Getter
@Setter
public class FrameworkResult implements Result {
	private Integer statusCode;
	private String message;
	private Object data;
	private PageResult pagination;
}
