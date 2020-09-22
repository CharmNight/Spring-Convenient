package com.night.controller;

import com.night.controller.body.UserBean;
import com.night.controller.body.UserRequest;
import com.night.response.ResultBean.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 偷懒测试的controller
 * 不想写测试用例 嗯！
 *
 * @author night
 */
@RestController
public class TestController {

	@ResponseResult
	@PostMapping("/hello")
	public List<String> hello(){
		List<String> list = new ArrayList<>();
		list.add("123");
		list.add("123");
		list.add("123");
		return list;
	}

	@ResponseResult
	@PostMapping("/hello2")
	public List<UserBean> hello2(@RequestBody UserRequest request){
		System.out.println(request.getId());
		List<UserBean> list = new ArrayList<>();
		list.add(new UserBean("123"));
		list.add(new UserBean("234"));
		list.add(new UserBean("435"));
		return list;
	}
}
