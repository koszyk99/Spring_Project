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
    private TaskRepository taskRepository;

    // Read (GET)
    @GetMapping("/task2")
    public List<Task> getTask2() {
        return taskRepository.findAll();
    }

    // Create (POST)
    @PostMapping("/task2")
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    // DELETE
    @DeleteMapping("/task2/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

    // Update (PUT)
    @PutMapping("/task2/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task updateTask) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setName(updateTask.getName());
        task.setDone(updateTask.isDone());
        return taskRepository.save(task);
    }
}