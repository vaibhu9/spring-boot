package com.example.service;

import com.example.request.EmployeeRequest;
import com.example.response.EmployeeRespose;

import java.util.List;

public interface EmployeeService {
    EmployeeRespose createEmployee(EmployeeRequest employeeRequest);
    EmployeeRespose getEmployee(Long id);
    List<EmployeeRespose> getAllEmployees();
    EmployeeRespose updateEmployee(Long id, EmployeeRequest employeeRequest);
    void deleteEmployee(Long id);
}
