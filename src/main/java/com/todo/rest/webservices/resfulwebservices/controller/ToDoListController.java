package com.todo.rest.webservices.resfulwebservices.controller;

import com.todo.rest.webservices.resfulwebservices.data.ToDoModel;
import com.todo.rest.webservices.resfulwebservices.data.WelcomeResponse;
import com.todo.rest.webservices.resfulwebservices.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ToDoListController {

    @Autowired
    ToDoListService toDoListService;

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public List<ToDoModel> fetchTodos() {
        //        return ResponseEntity.status(HttpStatus.OK).body(todoList);
        return toDoListService.findAllTodos();
    }
}
