package com.example.todoList.todolist.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.todoList.todolist.repository.JpaTodoRepository;
import com.example.todoList.todolist.repository.TodoRepository;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.todoList.todolist.repository")
public class AppConfig {

	@Bean
	public TodoRepository todoRepository() {
		return new JpaTodoRepository();
	}
}