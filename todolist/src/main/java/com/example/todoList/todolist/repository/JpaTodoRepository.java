package com.example.todoList.todolist.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todoList.todolist.entity.TodoEntity.Todo;

public interface JpaTodoRepository extends JpaRepository<Todo, Long>, TodoRepository {
}
