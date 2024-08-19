package com.example.response;

import lombok.Data;

@Data
public class EmployeeRespose {
    private Long id;
    private String name;
    private String email;
    private String contact;
    private double salary;
}
