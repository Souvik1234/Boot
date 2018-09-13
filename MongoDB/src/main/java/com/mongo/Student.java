package com.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="NEWUSER")
public class Student {

	@Id
	private int id;
	private String name;
	private String grade;
	public Student() {}
	public Student(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	
	
}
