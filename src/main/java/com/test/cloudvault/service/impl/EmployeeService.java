package com.test.cloudvault.service.impl;

import java.util.List;

import com.test.cloudvault.model.EmployeeModel;

public interface EmployeeService {
	List<EmployeeModel> getAllEmployees();

	EmployeeModel addEmployee(EmployeeModel employee);
}