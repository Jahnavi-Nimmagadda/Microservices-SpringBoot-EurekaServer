package com.cap.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.EmployeeDao;
import com.cap.entity.Employee;


@Service
@Transactional
public class EmployeeService implements EmpServiceImpl {

	@Autowired
	private EmployeeDao empDao;
	@Override
	public Employee createEmployee(Employee emp) {
		return empDao.save(emp);
	//	return "Added Employee Information" ;
	}



}

