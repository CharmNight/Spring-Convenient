package com.night.response.ResultBean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * 分页数据格式
 *
 * @author night
 */
@Getter
@Setter
public class PageResult {
	@JsonProperty("total")
	private Long total = null;

	@JsonProperty("current")
	private Integer current = null;

	@JsonProperty("pageSize")
	private Integer pageSize = null;
}
