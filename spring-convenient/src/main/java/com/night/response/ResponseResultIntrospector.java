package com.night.response;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class ResponseResultIntrospector extends JacksonAnnotationIntrospector {


	@Override
	public Object findSerializer(Annotated annotated) {
		ResponseResult annotation = annotated.getAnnotation(ResponseResult.class);
		if (annotation != null) {
			return super.findSerializer(annotated);
		}
		return super.findSerializer(annotated);
	}
}
