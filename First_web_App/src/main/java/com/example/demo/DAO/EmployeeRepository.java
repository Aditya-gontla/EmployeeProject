package com.example.demo.DAO;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Emplyoee;

public interface EmployeeRepository extends JpaRepository<Emplyoee ,Long>
{


}