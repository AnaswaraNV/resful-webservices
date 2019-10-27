package com.todo.rest.webservices.restfulwebservices.data;

public class WelcomeResponse {
    private String name;

    public String getName() {
        return "Hello" + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
