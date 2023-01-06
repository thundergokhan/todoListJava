package com.example.todoList.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoList.todolist.entity.TodoEntity.Todo;
import com.example.todoList.todolist.repository.TodoRepository;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
	private final TodoRepository todoRepository;
	private TodoController todoService;

	public TodoController(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	@GetMapping
	public List<Todo> getAllTodos() {
		return todoService.getAllTodos();
	}

	@PostMapping
	public Todo addTodo(@RequestBody Todo todo) {
		return todoRepository.save(todo);
	}

	// Diğer HTTP istekleri için (güncelleme, silme vb.) benzer metodlar
	// oluşturuyoruz

	@PutMapping("/{id}")
	public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
		return todoService.updateTodo(id, todo);
	}

	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable Long id) {
		todoService.deleteTodo(id);
	}

	@DeleteMapping
	public void deleteAllTodos() {
		todoService.deleteAllTodos();
	}

	@GetMapping("/{id}")
	public Optional<Todo> getTodoById(@PathVariable Long id) {
		return todoService.getTodoById(id);
	}

}
