package com.example.service.impl;

import com.example.entity.Employee;
import com.example.mapper.EmployeeMapper;
import com.example.repository.EmployeeRepository;
import com.example.request.EmployeeRequest;
import com.example.response.EmployeeRespose;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeRespose createEmployee(EmployeeRequest employeeRequest) {
        Employee employee = EmployeeMapper.INSTANCE.requestToEmployeeEntity(employeeRequest);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.INSTANCE.employeeEntityToRespose(savedEmployee);
    }

    @Override
    public EmployeeRespose getEmployee(Long id) {
        return null;
    }

    @Override
    public List<EmployeeRespose> getAllEmployees() {
        return List.of();
    }

    @Override
    public EmployeeRespose updateEmployee(Long id, EmployeeRequest employeeRequest) {
        return null;
    }

    @Override
    public Void deleteEmployee(Long id) {
        return null;
    }
}
