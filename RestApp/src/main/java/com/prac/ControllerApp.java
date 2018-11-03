package com.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerApp {

	@Autowired
	DBPush db1;
	
	@RequestMapping("/hello")
	public String SayHello()
	
	{
		return "Hello..Rest Call";
	}
	@RequestMapping("/push")
	
	public String pushDatatoDb(DBEntry db2) {
		/*DBEntry db2= new DBEntry();
		db2.setId(136);
		db2.setName("GHHKJHJKhkjhjkh");
		db2.setGrade("P");*/
		db1.save(db2);
		
		return "success";
	}
}

