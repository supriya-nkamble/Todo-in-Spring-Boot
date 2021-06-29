package com.supriyakamble.learning.spring.todomanagement.repository;

import com.supriyakamble.learning.spring.todomanagement.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository <Todo, Long> {
    List<Todo> findByUserName(String username);
}
