package com.night.response.handler;

import com.night.response.ResultBean.ResponseResult;
import com.night.response.ResultBean.Result;
import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 *
 * 实现{@link HandlerMethodReturnValueHandler}
 *
 * 在{@link #handleReturnValue} 方法中判断 该方法如果使用了
 * {@link ResponseResult} 注解 则进行默认的赋值
 *
 * @author night
 */
public class HandlerResponseResult implements HandlerMethodReturnValueHandler {

	private HandlerMethodReturnValueHandler delegate;

	public HandlerResponseResult(HandlerMethodReturnValueHandler delegate) {
		this.delegate = delegate;
	}

	@Override
	public boolean supportsReturnType(MethodParameter methodParameter) {
		return delegate.supportsReturnType(methodParameter);
	}

	@Override
	public void handleReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer, NativeWebRequest webRequest) throws Exception {
		if (returnType.hasMethodAnnotation(ResponseResult.class)) {
			ResponseResult resultAnnotation = returnType.getMethodAnnotation(ResponseResult.class);
			Class<? extends Result> clazz = resultAnnotation.value();
			Result result = clazz.newInstance();
			result.setData(returnValue);
			result.setMessage("");
			result.setStatusCode(200);
			delegate.handleReturnValue(result, returnType, mavContainer, webRequest);
		}else {
			delegate.handleReturnValue(returnValue, returnType, mavContainer, webRequest);
		}
	}
}
