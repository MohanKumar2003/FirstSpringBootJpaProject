package com.twg.firstspringbootjpaproject.repository;

import org.springframework.data.jpa.repository.*;

import com.twg.firstspringbootjpaproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
