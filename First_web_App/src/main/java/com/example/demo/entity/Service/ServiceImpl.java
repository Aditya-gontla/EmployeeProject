package com.example.demo.entity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.entity.Employee;

@Service
public class ServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public ModelAndView getallEmployees() {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("employees", employeerepository.findAll());
		return mv;
	}

	@Override
	public ModelAndView updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp=employeerepository.findById(employee.getId()).orElseThrow();
		emp.setId(employee.getId());
		emp.setFname(employee.getFname());
		emp.setLname(employee.getLname());
		emp.setEmail(employee.getEmail());
		return getallEmployees();
	}

	@Override
	public ModelAndView addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeerepository.save(employee);
		return getallEmployees();
	}

	@Override
	public ModelAndView deleteid(long id) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(id);
		return getallEmployees();
	}
	
	
}
