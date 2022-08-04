package com.example.demo.entity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.entity.Emplyoee;

@Service
public class ServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;
	
	@Override
	public List<Emplyoee> getEmployees() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

	@Override
	public void save(Emplyoee employee) {
		// TODO Auto-generated method stub
		employeerepository.save(employee);
	}

	@Override
	public void deleteid(long id) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(id);
		
	}

	@Override
	public void update(Emplyoee employee) {
		// TODO Auto-generated method stub
		Emplyoee current = employeerepository.findById(employee.getId()).orElseThrow();
		current.setId(employee.getId());
		current.setFname(employee.getFname());
		current.setLname(employee.getLname());
		current.setEmail(employee.getEmail());
		 employeerepository.save(current);
		
	}


}
