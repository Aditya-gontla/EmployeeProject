package com.example.demo.entity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Emplyoee;
import com.example.demo.entity.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/get")
	private List<Emplyoee> getAllEmployee()
	{
		return employeeservice.getEmployees();
		
	}
	@PostMapping("/saveemp")
	private String save(@RequestBody Emplyoee employee)
	{
		employeeservice.save(employee);
		return "Saved sucessfully";
		
	}
	@DeleteMapping("/employees/{id}")
	private String deletebyid(@PathVariable("id") long id)
	{
		employeeservice.deleteid(id);
		return "Deleted successfully";
	}
	@PutMapping("/update")
	private String update(@RequestBody Emplyoee employee)
	{
		employeeservice.update(employee);
		return "updated sucessfully";
		
	}
}
