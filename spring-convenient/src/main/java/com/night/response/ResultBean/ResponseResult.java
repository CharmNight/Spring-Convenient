package com.night.response.ResultBean;

import java.lang.annotation.*;

/**
 * 封装的注解
 *
 * 返回数据只需要添加 {@link ResponseResult } 注解 不需要手动封装response结构
 *
 * @author night
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {
	Class<? extends Result> value() default FrameworkResult.class;
}
