package com.prac;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("rest-app")
public interface RestInterfac {

	@RequestMapping("/hello")
	public String sayHello();
	
	@RequestMapping("/push")
	public String pushDatatoDb(DBEntry db);
	
	
}
