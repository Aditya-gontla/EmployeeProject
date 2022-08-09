package com.example.demo.entity.Service;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	ModelAndView getallEmployees();
	ModelAndView deleteid(long id);
    ModelAndView updateEmployee(Employee employee);
	ModelAndView addEmployee(Employee employee);
	
}
