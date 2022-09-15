package com.emp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> saveAll(Employee employee);

}
