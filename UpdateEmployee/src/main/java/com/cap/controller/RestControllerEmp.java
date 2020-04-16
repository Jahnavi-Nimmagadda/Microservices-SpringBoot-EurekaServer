package com.cap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.Employee;
import com.cap.service.EmployeeService;

@RestController
@RequestMapping(path="/UpdateEmp")
@CrossOrigin("http://localhost:2226")//
public class RestControllerEmp{

	@Autowired
	private EmployeeService empService;

	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee emp) {
		return empService.updateEmployee(emp);
	}
}


