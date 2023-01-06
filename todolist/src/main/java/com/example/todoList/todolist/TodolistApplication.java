package com.example.todoList.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.example.todoList.todolist.controller", "com.example.todoList.todolist.repository",
		"com.example.todoList.todolist.service" })
@SpringBootApplication
public class TodolistApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
		
	}
}