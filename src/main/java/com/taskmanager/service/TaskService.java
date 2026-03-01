package com.taskmanager.service;



import java.util.List;
import org.springframework.stereotype.Service;

import com.taskmanager.entity.Employee;
import com.taskmanager.entity.Task;
import com.taskmanager.repository.EmployeeRepository;
import com.taskmanager.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final EmployeeRepository employeeRepository;

    public Task createTask(Task task, Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        task.setEmployee(employee);
        task.setStatus("PENDING");
        return taskRepository.save(task);
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task updateStatus(Long id, String status) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setStatus(status);
        return taskRepository.save(task);
    }
}