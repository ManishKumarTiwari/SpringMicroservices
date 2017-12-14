package com.nagarro.demoClient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.demoClient.feignclient.feignInterface;
import com.nagarro.demoClient.models.Employee;
import com.nagarro.demoClient.services.EmployeeService;

@Controller
public class ConsumerClient {
		
	@Autowired
	private RestTemplate restTemplet;
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private feignInterface feignobject;
	
	@RequestMapping(value="/client/hello")
	public @ResponseBody Employee getEmploye(){			
		Employee newEmployee=feignobject.getData();
		service.saveEmployee(newEmployee);
		return newEmployee;
		
	}	
}
