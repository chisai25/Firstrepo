package com.backend_springboot.Service;

import java.util.List;

import com.backend_springboot.Model_Entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();

}
