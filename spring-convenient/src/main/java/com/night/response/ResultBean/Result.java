package com.night.response.ResultBean;

/**
 * 返回内容必须涵盖的内容
 *
 * @author night
 */
public interface Result {
	/**
	 * 返回状态 成功200
	 */
	Integer statusCode = null;
	/**
	 * 错误信息
	 */
	String message = null;
	/**
	 * 返回数据
	 */
	Object data = null;
	/**
	 * 分页信息
	 */
	PageResult pagination = null;

	void setStatusCode(Integer statusCode);

	void setMessage(String message);

	void setData(Object data);

	void setPagination(PageResult pagination);
}
