package com.example.demo.entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Service.ServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private ServiceImpl employeeservice;
	
	@GetMapping("/home")
	public ModelAndView home()
	{
		return employeeservice.getallEmployees();
		
	}
	@PostMapping("/updateEmployee")
	public ModelAndView updateemployee(long id1,long id,String fname,String lname,String email)
	{
		Employee emp=new Employee(id,fname,lname,email);
		return employeeservice.updateEmployee(emp);
		
	}
	@PostMapping("/addEmployee")
	public ModelAndView addEmployee(long id,String fname,String lname,String email)
	{
		 Employee employee=new Employee(id,fname,lname,email);
		 return employeeservice.addEmployee(employee);
		
	}
	@PostMapping("/removeEmployee")
	public ModelAndView removeEmployee(long id)
	{
		return employeeservice.deleteid(id);
		
	}
	
}
