package com.night.response.handler.factory;


import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author night
 */
public interface FactoryResult {
	/**
	 * 根据不同 class 构建具体的 返回结构
	 * @param obj  返回的val
	 * @param clazz {@link com.night.response.ResultBean.ResponseResult} val 指定的class
	 * @param mavContainer
	 * @return
	 */
	Object buildResult(Object obj, Class clazz, ModelAndViewContainer mavContainer);

}
