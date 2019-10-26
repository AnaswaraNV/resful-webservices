package com.todo.rest.webservices.resfulwebservices.controller;

import com.todo.rest.webservices.resfulwebservices.data.WelcomeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloController {

    @RequestMapping(value = "/welcome/{name:.+}", method = RequestMethod.GET)
    public ResponseEntity<?> displayHelloWorld(@PathVariable String name) {

        WelcomeResponse welcomeResponse = new WelcomeResponse();
        welcomeResponse.setName(name);
        return ResponseEntity.status(HttpStatus.OK).body(welcomeResponse.getName());
    }
}
