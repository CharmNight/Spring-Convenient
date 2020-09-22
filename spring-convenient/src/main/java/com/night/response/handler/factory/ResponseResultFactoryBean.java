package com.night.response.handler.factory;

import com.night.response.ResultBean.Result;
import com.night.response.handler.factory.FactoryResult;

/**
 *
 * {@link com.night.response.ResultBean.ResponseResult} 注解的类返回
 *
 * @author night
 */
public class ResponseResultFactoryBean implements FactoryResult {

	@Override
	public Object buildResult(Object returnValue, Class clazz) {
		Result result = null;
		try {
			result = (Result) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		result.setData(returnValue);
		result.setMessage("");
		result.setStatusCode(200);
		return result;
	}
}
