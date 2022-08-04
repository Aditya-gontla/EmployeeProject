package com.example.demo.entity.Service;

import java.util.List;

import com.example.demo.entity.Emplyoee;

public interface EmployeeService {
	List<Emplyoee> getEmployees();
	void save(Emplyoee employee);
	void deleteid(long id);
	void update(Emplyoee employee);
	

}
