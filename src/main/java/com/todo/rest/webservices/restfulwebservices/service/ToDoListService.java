package com.todo.rest.webservices.restfulwebservices.service;

import com.todo.rest.webservices.restfulwebservices.data.ToDoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ToDoListService {

    private List<ToDoModel> todoList = new ArrayList<>();

    ToDoModel todo1 = ToDoModel.builder()
                    .id("1")
                    .username("abc")
                    .createdDate(new Date())
                    .description("Learn to Dance")
                    .isCompleted(false)
                    .build();

    ToDoModel todo2 = ToDoModel.builder()
                    .id("1")
                    .username("abc")
                    .createdDate(new Date())
                    .description("Be an expert in java")
                    .isCompleted(false)
                    .build();


    public List<ToDoModel> findAllTodos() {
        todoList = Arrays.asList(todo1 , todo2);
        return todoList;
    }




}
