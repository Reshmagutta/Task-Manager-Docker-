package com.taskmanager.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.taskmanager.entity.Task;
import com.taskmanager.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/{employeeId}")
    public Task createTask(@RequestBody Task task, @PathVariable Long employeeId) {
        return taskService.createTask(task, employeeId);
    }

    @GetMapping
    public List<Task> getAll() {
        return taskService.getAll();
    }

    @PutMapping("/{id}")
    public Task updateStatus(@PathVariable Long id, @RequestParam String status) {
        return taskService.updateStatus(id, status);
    }
}