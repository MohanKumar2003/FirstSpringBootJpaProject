package com.twg.firstspringbootjpaproject.service;

import java.util.List;

import com.twg.firstspringbootjpaproject.entity.Employee;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deletEmployee(Employee employee);
    public Employee findById(long id);
    public List<Employee> findall();
}
