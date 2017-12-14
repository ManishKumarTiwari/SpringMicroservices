package com.nagarro.demoServer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.demoServer.models.Employee;

@RestController
public class HelloServer {
	
	@GetMapping(value="/server/hello")
	public @ResponseBody Employee SendResponse(){
		System.out.println("/n/n/n");
		System.out.println("in server");
		Employee nextEmployee=new Employee();
		System.out.println(nextEmployee.getDate());
		
		System.out.println("in server*********************************");
		return nextEmployee;
	}
}
