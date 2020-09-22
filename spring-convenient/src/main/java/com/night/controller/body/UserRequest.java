package com.night.controller.body;

import com.night.response.ResultBean.PageResult;
import lombok.Data;

@Data
public class UserRequest {
	private String id;

	private PageResult pageResult;

	public PageResult getPageResult() {
		return pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
