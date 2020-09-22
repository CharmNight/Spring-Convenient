package com.night.response.config;

import com.night.response.handler.HandlerResponseResult;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 实现{@link InitializingBean}
 * 将 自己封装的{@link HandlerResponseResult} 进行装配
 *
 * @author night
 */
@Configuration
public class ReturnResultConfig implements InitializingBean {
	@Autowired
	RequestMappingHandlerAdapter requestMappingHandlerAdapter;

	@Override
	public void afterPropertiesSet() throws Exception {
		List<HandlerMethodReturnValueHandler> unmodifiableList = requestMappingHandlerAdapter.getReturnValueHandlers();
		List<HandlerMethodReturnValueHandler> list = new ArrayList<>(unmodifiableList.size());
		for (HandlerMethodReturnValueHandler returnValueHandler : unmodifiableList) {
			if (returnValueHandler instanceof RequestResponseBodyMethodProcessor) {
				list.add(new HandlerResponseResult(returnValueHandler));
			} else {
				list.add(returnValueHandler);
			}
		}
		requestMappingHandlerAdapter.setReturnValueHandlers(list);
	}
}
