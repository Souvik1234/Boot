package com.call;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Data db;
	
	@RequestMapping("/msg")
	public List<Student> getMessage() {
		return db.findAll();
	}
	
}
