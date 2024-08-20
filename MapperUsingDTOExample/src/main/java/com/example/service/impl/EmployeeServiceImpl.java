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
        Employee employee = employeeRepository.findById(id).get();
        return EmployeeMapper.INSTANCE.employeeEntityToRespose(employee);
    }

    @Override
    public List<EmployeeRespose> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return EmployeeMapper.INSTANCE.employeeEntityListToRespose(employees);
    }

    @Override
    public EmployeeRespose updateEmployee(Long id, EmployeeRequest employeeRequest) {
        Employee employee = employeeRepository.findById(id).get();
        if(!employeeRepository.existsById(id)){
            return null;
        }
        Employee updatedEmployee = EmployeeMapper.INSTANCE.requestToEmployeeEntity(employeeRequest);
        updatedEmployee.setId(id);
        employeeRepository.save(updatedEmployee);
        return EmployeeMapper.INSTANCE.employeeEntityToRespose(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
