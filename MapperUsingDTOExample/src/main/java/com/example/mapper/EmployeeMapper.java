package com.example.mapper;

import com.example.entity.Employee;
import com.example.request.EmployeeRequest;
import com.example.response.EmployeeRespose;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    Employee requestToEmployeeEntity(EmployeeRequest request);

    EmployeeRespose employeeEntityToRespose(Employee employee);

    List<EmployeeRespose> employeeEntityListToRespose(List<Employee> employees);
}
