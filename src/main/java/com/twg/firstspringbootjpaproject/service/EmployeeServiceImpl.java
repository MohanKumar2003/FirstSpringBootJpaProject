package com.twg.firstspringbootjpaproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.firstspringbootjpaproject.entity.Employee;
import com.twg.firstspringbootjpaproject.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deletEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Employee findById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findall() {
        return employeeRepository.findAll();
    }
    
}
