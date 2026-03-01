package com.taskmanager.service;



import java.util.List;
import org.springframework.stereotype.Service;

import com.taskmanager.entity.Employee;
import com.taskmanager.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}