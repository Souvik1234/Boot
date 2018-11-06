package com.call;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rest-call")
public interface DetailFromRest {

	@RequestMapping("/msg")
	public List<Student> getMessage();
}
