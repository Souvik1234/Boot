package com.example.demo;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gen.Generate;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
//@Api(value = "ProductsControllerAPI" , produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public class Control {

	@Autowired
	private DB d;
	
	@Autowired
	Generate g; //check ObjGen class
	
	
	@RequestMapping(value="/" , method=RequestMethod.GET) 
	//@ApiOperation("Gets the DEPT detail for specific ID")
	//@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = Dept.class)})
	public List<Dept> getAll(HttpServletRequest r) {
		/*r.setAttribute("data", d.findByDeptno(20));
		System.out.println(g.getKey());
		return "home";*/
		return d.findAll();
	}
	
	@RequestMapping(value="/x" , method=RequestMethod.POST) 
	//@ApiOperation("Gets the DEPT detail for specific ID")
	//@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = Dept.class)})
	public String getX(@RequestBody Dept dp) {
		
		d.save(dp);
		return "Successfully Saved!!";
	}
	
	
	
}
