package com.krzysztof.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class TaskService {
    
    @Autowired 
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(Long id, Task updateTask) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setName(updateTask.getName());
        task.setDone(updateTask.isDone());
        return taskRepository.save(task);
    }
}
