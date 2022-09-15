package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	// Add new Employee
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	// Add more than one Employee
	@PostMapping("/addEmployees")
	public List<Employee> addAllEmployees(@RequestBody List<Employee> employee){
		return employeeService.addAllEmployees(employee);	
	}
	
	// Get Employee by Id
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
		
	}
	
	// update Employee
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
		
	}
	
	// Delete Employee
	@DeleteMapping("/deleteEmployee/{id}")
	public boolean deleteEmployeeById(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
		
	}
	
	
	// Get all Employee
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
		
		
	}
}
