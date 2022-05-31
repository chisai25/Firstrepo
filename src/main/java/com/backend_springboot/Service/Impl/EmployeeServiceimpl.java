package com.backend_springboot.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend_springboot.Model_Entity.Employee;
import com.backend_springboot.Repository.EmployeeRepository;
import com.backend_springboot.Service.EmployeeService;

@Service 
public class EmployeeServiceimpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	

	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

}
