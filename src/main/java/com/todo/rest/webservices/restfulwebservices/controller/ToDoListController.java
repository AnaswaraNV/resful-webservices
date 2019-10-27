package com.todo.rest.webservices.restfulwebservices.controller;

import com.todo.rest.webservices.restfulwebservices.data.ToDoModel;
import com.todo.rest.webservices.restfulwebservices.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
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
