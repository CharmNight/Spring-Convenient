package com.night.response.handler.factory;

import com.night.response.ResultBean.Result;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * {@link com.night.response.ResultBean.ResponseResult} 注解的类返回
 *
 * @author night
 */
public class ResponseResultFactoryBean implements FactoryResult {

	@Override
	public Object buildResult(Object returnValue, Class clazz, ModelAndViewContainer mavContainer) {
		Result result = null;
		try {
			result = (Result) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		ModelMap defaultModel = mavContainer.getDefaultModel();
		defaultModel.forEach((item, val)->{
			System.out.println(item);
			System.out.println(val);
		});
		BeanPropertyBindingResult o = (BeanPropertyBindingResult)mavContainer.getDefaultModel().get("org.springframework.validation.BindingResult.userRequest");
		Object target = o.getTarget();

		result.setData(returnValue);
		result.setMessage("");
		result.setStatusCode(200);
		return result;
	}
}
