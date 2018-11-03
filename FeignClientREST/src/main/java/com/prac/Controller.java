package com.prac;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

	@Autowired
	private RestInterfac d;
	
	@RequestMapping("/rest")
	public String getCallValue() {
		return d.sayHello();
	}
	
	@RequestMapping("/push")
	public String pushDataCtrl() {
		DBEntry db = new DBEntry();
		db.setId(88);
		db.setName("XXXXX");
		db.setGrade("D");
		d.pushDatatoDb(db);
		
		return "success";
	}
	
}
