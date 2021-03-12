package com.ltts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ltts.entity.Employee;
import com.ltts.repository.EmployeeRepository;
import com.ltts.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(value = "/getString", method = RequestMethod.GET)
	public String getString() {
		return "welcome";
	}

	@GetMapping(value = "/index")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(value="/getEmployeeDetails")
	public List<Employee> getEmployeeDetails(){
		return employeeRepository.findAll();	
	}
	@PostMapping(value="/employeedata")
	public Employee saveEmployeeDetails(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}
}
