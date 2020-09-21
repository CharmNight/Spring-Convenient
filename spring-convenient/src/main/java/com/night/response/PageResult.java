package com.night.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

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
