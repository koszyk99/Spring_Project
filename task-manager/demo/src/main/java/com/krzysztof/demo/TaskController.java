package com.krzysztof.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// HTTP request class
@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // a method handling GET requests at a given path
    @GetMapping("/task2")
    public List<Task> getTask2() {
        return taskRepository.findAll();
    }

    @PostMapping("/task2")
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}