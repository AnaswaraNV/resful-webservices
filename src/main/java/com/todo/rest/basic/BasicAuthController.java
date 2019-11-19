package com.todo.rest.basic;

import com.todo.rest.webservices.restfulwebservices.security.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthController {

    @RequestMapping(value = "/basicauth", method = RequestMethod.GET)
    public AuthenticationBean authenticateUser() {
        return new AuthenticationBean("You are authenticated!");
    }
}
