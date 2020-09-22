package com.night.controller.body;

import com.night.request.BaseRequest;

public class UserBean implements BaseRequest {
	private String name;

	public UserBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
