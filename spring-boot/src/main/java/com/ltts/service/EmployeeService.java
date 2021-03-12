package com.ltts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ltts.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployeeDetails();
	
	public Employee saveEmployeeDetails(Employee emp);

}
