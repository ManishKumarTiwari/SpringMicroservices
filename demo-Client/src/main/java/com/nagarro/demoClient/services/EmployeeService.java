package com.nagarro.demoClient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.demoClient.models.Employee;
import com.nagarro.demoClient.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public void saveEmployee(Employee newEmployee) {
		repository.save(newEmployee);		
	}

}
