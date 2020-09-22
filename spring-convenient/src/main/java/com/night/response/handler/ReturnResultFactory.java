package com.night.response.handler;

import com.night.response.ResultBean.ResponseResult;
import com.night.response.ResultBean.Result;
import com.night.response.handler.factory.FactoryResult;
import com.night.response.handler.factory.ResponseResultFactoryBean;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * {@link HandlerResponseResult} 中调用
 * 获取 返回格式
 *
 * @author night
 */
public class ReturnResultFactory {

	public static Object getReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer) {

		// 使用 @ResponseResult 注解
		if (returnType.hasMethodAnnotation(ResponseResult.class)) {
			ResponseResult resultAnnotation = returnType.getMethodAnnotation(ResponseResult.class);
			Class<? extends Result> clazz = resultAnnotation.value();

			FactoryResult factoryResult = new ResponseResultFactoryBean();
			return factoryResult.buildResult(returnValue, clazz, mavContainer);
		}
		return returnValue;
	}
}
