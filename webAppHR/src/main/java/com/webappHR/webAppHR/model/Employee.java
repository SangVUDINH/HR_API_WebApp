package com.webappHR.webAppHR.model;

import lombok.Data;

//une DTO
@Data
public class Employee {
    
    private Integer id;
    private String  firstName;

    private String  lastName;

    private String  mail;

    private String  password;
    

}
