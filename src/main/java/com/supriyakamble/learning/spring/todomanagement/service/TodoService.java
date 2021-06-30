package com.supriyakamble.learning.spring.todomanagement.service;

import com.supriyakamble.learning.spring.todomanagement.model.Todo;
import com.supriyakamble.learning.spring.todomanagement.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements TodoInterfaceService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getTodoByUsername(String username) {
        return todoRepository.findByUserName(username);
    }

    @Override
    public Optional<Todo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String username, String task, Date dueDate, boolean isCompleted) {
        todoRepository.save(new Todo(username, task, dueDate, isCompleted));
    }

    @Override
    public void deleteTodo(long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if(todo.isPresent()){
            todoRepository.delete(todo.get());
        }

    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
