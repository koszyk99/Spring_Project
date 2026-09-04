package com.krzysztof.demo;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// HTTP request class
@RestController
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    // a method handling GET requests at a given path
    @GetMapping("/task2")
    public List<Task> getTask2() {
        return tasks;
    }

    @PostMapping("/task2")
    public Task addTask(@RequestBody Task task) {
        tasks.add(task);
        return task;
    }
}