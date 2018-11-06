package com.call;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@Autowired
	 DetailFromRest d;
	
	@RequestMapping("/own")
	public List<Student> dispMsg() {
		return d.getMessage();
	}
}
