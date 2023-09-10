package com.shreyas.de.todoapp.resource;

import com.shreyas.de.todoapp.exception.TaskNotFoundException;
import com.shreyas.de.todoapp.model.ToDoTask;
import com.shreyas.de.todoapp.service.ToDoTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ToDoTaskController {

    private final ToDoTaskService toDoTaskService;

    @PostMapping("/saveTask")
    public ToDoTask saveTask(@RequestBody ToDoTask task){
        return toDoTaskService.save(task);
    }

    @GetMapping("/tasks")
    public List<ToDoTask> getTasks(){
        return toDoTaskService.findAll();
    }

    @GetMapping("/task/{id}")
    public ToDoTask getTasks(@PathVariable("id") Long id){
        return toDoTaskService.findById(id).orElseThrow(()->new TaskNotFoundException("task with not found id {} "+id));
    }

    @GetMapping("/test")
    public String test(){
        return "working";
    }
}
