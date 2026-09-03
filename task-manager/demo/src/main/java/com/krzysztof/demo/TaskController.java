package com.krzysztof.demo;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// HTTP request class
@RestController
public class TaskController {

    // a method handling GET requests at a given path
    @GetMapping("/task2")
    public List<Task> getTask2() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task ("Buy water", false));
        tasks.add(new Task ("Buy juice", true));
        return tasks;
    }
}