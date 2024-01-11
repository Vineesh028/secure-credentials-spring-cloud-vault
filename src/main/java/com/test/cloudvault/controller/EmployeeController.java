package com.test.cloudvault.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.cloudvault.model.EmployeeModel;
import com.test.cloudvault.service.impl.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<EmployeeModel> firstPage() {

		return empService.getAllEmployees();

	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public EmployeeModel addEmployee(@RequestBody EmployeeModel employee) {

		return empService.addEmployee(employee);

	}

}
