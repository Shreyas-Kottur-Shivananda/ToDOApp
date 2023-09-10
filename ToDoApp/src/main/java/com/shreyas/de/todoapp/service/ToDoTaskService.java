package com.shreyas.de.todoapp.service;

import com.shreyas.de.todoapp.model.ToDoTask;
import com.shreyas.de.todoapp.repository.iToDoTaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDoTaskService implements iToDoTaskRepository {

    private final iToDoTaskRepository iToDoTaskRepository;


    @Override
    public <S extends ToDoTask> S save(S task) {
        return iToDoTaskRepository.save(task);
    }

    @Override
    public <S extends ToDoTask> List<S> saveAll(Iterable<S> tasks) {
        return iToDoTaskRepository.saveAll(tasks);
    }

    @Override
    public Optional<ToDoTask> findById(Long id) {
        return iToDoTaskRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<ToDoTask> findAll() {
        return iToDoTaskRepository.findAll();
    }

    @Override
    public List<ToDoTask> findAllById(Iterable<Long> ids) {
        return iToDoTaskRepository.findAllById(ids);
    }

    @Override
    public long count() {
        return iToDoTaskRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        iToDoTaskRepository.deleteById(id);
    }

    @Override
    public void delete(ToDoTask task) {
        iToDoTaskRepository.delete(task);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        iToDoTaskRepository.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends ToDoTask> tasks) {
        iToDoTaskRepository.deleteAll(tasks);
    }

    @Override
    public void deleteAll() {
        iToDoTaskRepository.deleteAll();
    }
}
