package com.cap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.EmployeeDao;
import com.cap.entity.Employee;


@Service
public class EmployeeService implements EmpServiceImpl {

	@Autowired
	private EmployeeDao empDao;

	@Override
	public Optional<Employee> findEmployee(Integer empId) {

		return empDao.findById(empId);
	}

}

