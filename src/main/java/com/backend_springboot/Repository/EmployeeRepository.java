package com.backend_springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend_springboot.Model_Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
