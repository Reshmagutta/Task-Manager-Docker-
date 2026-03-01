package com.taskmanager.controller;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.taskmanager.entity.Employee;
import com.taskmanager.service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }
}