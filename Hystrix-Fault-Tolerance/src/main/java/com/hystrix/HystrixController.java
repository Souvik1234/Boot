package com.hystrix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HystrixController {

	@RequestMapping("/show")
	@HystrixCommand(fallbackMethod="getFault", commandKey="show", groupKey="show")
	public String show()
	{
		if(Math.random()>0.5) {
			throw new RuntimeException("Custom");
		}
		return "Passed!!";
	}
	
	
	public String getFault() {
		return "Fallback occurred";
	}
}
