package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;

public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll() ;
	}

	public List<Employee> addAllEmployees(List<Employee> employee) {
		// TODO Auto-generated method stub
		return employeeRepository.saveAll(employee);
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee employee) {
		Employee existingEmp = employeeRepository.findById(employee.getId()).orElse(null);
		System.out.println(employee);
		if(existingEmp == null) {
			System.out.println("Employee not found");
		}
		else {
			existingEmp.setName(employee.getName());
			existingEmp.setAge(employee.getAge());
			existingEmp.setEmail(employee.getEmail());
			existingEmp.setSalary(employee.getSalary());	
		}
		return employee;
		
	}

	public boolean deleteEmployeeById(int id) {
		Employee existingEmp = employeeRepository.getById(id);
		if(existingEmp != null) {
			employeeRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
