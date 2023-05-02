package com.twg.firstspringbootjpaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

import com.twg.firstspringbootjpaproject.entity.Employee;
import com.twg.firstspringbootjpaproject.service.EmployeeService;

// @RestController
@Controller
public class HomeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String insertEmployee(Model model) {

        Employee employee = new Employee();
        
        employee.setName("Microsoft");
        employee.setDesignation("Team Leader");
        employee.setDepartment("Software Designer");
        employee.setExp(4);
        
        Employee emp = employeeService.saveEmployee(employee);

        String msg = "Employee " + emp.getName() + " with id " + emp.getId() + " is saved successfully...!";

        model.addAttribute("employee", emp);
        model.addAttribute("message", msg);
        
        return "home";
    }
}
