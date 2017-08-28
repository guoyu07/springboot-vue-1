package com.example.controller;


import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/23 9:47
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("getEmployees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("getEmployee")
    public Employee getEmployee(Integer employeeId) {
        int i = 0;
        return employeeService.getEmployee(employeeId);
    }

    @RequestMapping("modifyEmployee")
    public void modifyEmployee(Employee employee) {
        employeeService.modifyEmployee(employee);
    }

    @RequestMapping("saveEmployee")
    public void saveEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @RequestMapping("deleteEmployee")
    public void deleteEmployee(Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
