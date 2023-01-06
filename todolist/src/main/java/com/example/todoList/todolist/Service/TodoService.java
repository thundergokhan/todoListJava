package com.example.todoList.todolist.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoList.todolist.entity.TodoEntity.Todo;
import com.example.todoList.todolist.repository.TodoRepository;

@Service
public class TodoService {
	private final TodoRepository todoRepository;

	@Autowired
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public List<Todo> getAllTodos() {
		return todoRepository.findAll();
	}

	public Todo addTodo(Todo todo) {
		return todoRepository.save(todo);
	}

	public Todo updateTodo(Todo todo) {
		return todoRepository.save(todo);
	}

	public void deleteTodo(Long id) {
		todoRepository.deleteById(id);
	}

	public void deleteAllTodos() {
		todoRepository.deleteAll();
	}

	public Optional<Todo> getTodoById(Long id) {
		return todoRepository.findById(id);
	}

}
