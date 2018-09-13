package com.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@Autowired
	private DBCon d;
	
	@RequestMapping("/all")
	public List<Student> getAllData() {
		return d.findAll();
	}
	
	@RequestMapping("/s")
	public String saveData() {
		d.save(new Student(101, "Sadhana", "B"));
		return "Success";
	}
}
