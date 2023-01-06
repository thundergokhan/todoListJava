package com.example.todoList.todolist.repository;

import javax.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todoList.todolist.entity.TodoEntity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
// JPA metodlarını kullanarak veritabanındaki Todo nesnelerine erişebilecek
// metodlar burada tanımlanır.

	@Override
	List<Todo> findAll();

	void deleteById(Long id);

	void deleteAll();

	Todo save(Todo todo);

	Optional<Todo> findById(Long id);
}