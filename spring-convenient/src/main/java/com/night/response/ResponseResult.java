package com.night.response;

import java.lang.annotation.*;

/**
 * @author night
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {
	Class<? extends Result> value() default FrameworkResult.class;
}
