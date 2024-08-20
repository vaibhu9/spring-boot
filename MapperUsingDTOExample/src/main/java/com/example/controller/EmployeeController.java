package com.example.controller;

import com.example.request.EmployeeRequest;
import com.example.response.EmployeeRespose;
import com.example.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    EmployeeRespose createEmployee(EmployeeRequest employeeRequest) {
        return employeeService.createEmployee(employeeRequest);
    }
}
