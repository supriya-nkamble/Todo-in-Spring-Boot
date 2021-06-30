package com.supriyakamble.learning.spring.todomanagement.service;

import com.supriyakamble.learning.spring.todomanagement.model.Todo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TodoInterfaceService {
    List<Todo> getTodoByUsername(String username);
    Optional<Todo> getTodoById(long id);
    void updateTodo(Todo todo);
    void addTodo(String username, String task, Date dueDate, boolean isCompleted);
    void deleteTodo(long id);
    void saveTodo(Todo todo);
}
