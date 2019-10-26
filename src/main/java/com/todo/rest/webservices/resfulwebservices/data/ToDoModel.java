package com.todo.rest.webservices.resfulwebservices.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToDoModel {
    private String id;
    private String username;
    private String description;
    private Date createdDate;
    private boolean isCompleted;
}
