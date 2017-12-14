package com.nagarro.demoClient.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.nagarro.demoClient.models.Employee;

@FeignClient("HelloServer")
public interface feignInterface {
	@GetMapping("/server/hello")
	public Employee getData();
}
