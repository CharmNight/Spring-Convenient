package com.night.test.test.controller;


import com.night.response.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

	@ResponseResult
	@GetMapping("/hello")
	public List<String> hello(){
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("123");
		arrayList.add("123");
		arrayList.add("123");
		return arrayList;
	}

}
