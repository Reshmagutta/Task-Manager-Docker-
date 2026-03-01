package com.taskmanager.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}