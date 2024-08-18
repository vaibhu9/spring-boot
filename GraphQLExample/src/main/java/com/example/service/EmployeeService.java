package com.example.service;

import com.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployee(Long id);
    List<Employee> getEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
