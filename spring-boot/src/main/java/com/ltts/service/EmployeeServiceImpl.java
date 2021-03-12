package com.ltts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.entity.Employee;
import com.ltts.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployeeDetails() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee saveEmployeeDetails(Employee emp) {
		return employeeRepository.save(emp);
	}

}
