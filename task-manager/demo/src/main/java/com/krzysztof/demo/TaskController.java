package com.krzysztof.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// HTTP request class
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Read (GET)
    @GetMapping("/task2")
    public List<Task> getTask2() {
        return taskService.getAllTasks();
    }

    // Create (POST)
    @PostMapping("/task2")
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    // DELETE
    @DeleteMapping("/task2/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    // Update (PUT)
    @PutMapping("/task2/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        return taskService.updateTask(id, updatedTask);
    }
}