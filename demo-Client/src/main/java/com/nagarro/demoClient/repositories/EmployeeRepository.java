package com.nagarro.demoClient.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.demoClient.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}
