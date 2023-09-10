package com.shreyas.de.todoapp.repository;

import com.shreyas.de.todoapp.model.ToDoTask;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iToDoTaskRepository extends ListCrudRepository<ToDoTask,Long> {
}
