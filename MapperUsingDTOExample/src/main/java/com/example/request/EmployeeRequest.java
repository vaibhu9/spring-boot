package com.example.request;

import lombok.Data;

@Data
public class EmployeeRequest {
    private String name;
    private String email;
    private String contact;
    private double salary;
}
