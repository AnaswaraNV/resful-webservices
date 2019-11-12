package com.todo.rest.webservices.restfulwebservices.security;

import com.todo.rest.webservices.restfulwebservices.security.AuthenticationBean;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthController {

    @RequestMapping(value = "/basicauth", method = RequestMethod.GET)
    public AuthenticationBean authenticateUser() {
        return new AuthenticationBean("You are authenticated!");
    }
}
