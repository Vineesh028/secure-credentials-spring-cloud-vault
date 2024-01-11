package com.test.cloudvault.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.cloudvault.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, String>{
}