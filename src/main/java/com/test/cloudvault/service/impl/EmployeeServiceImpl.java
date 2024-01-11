package com.test.cloudvault.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.cloudvault.entity.Employee;
import com.test.cloudvault.model.EmployeeModel;
import com.test.cloudvault.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	private ModelMapper modelMapper;

	public List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel> employees = employeeDao.findAll().stream().map(
				e -> modelMapper.map(e, EmployeeModel.class)).collect(Collectors.toList());
		return employees;
	}

	@Override
	public EmployeeModel addEmployee(EmployeeModel employee) {
		
		System.out.println("EmployeeModel "+employee);
		
		Employee emp = employeeDao.save(modelMapper.map(employee, Employee.class));
		return modelMapper.map(emp, EmployeeModel.class);
	}

	

}