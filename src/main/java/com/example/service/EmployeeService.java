package com.example.service;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/23 9:40
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    public Employee getEmployee(Integer employeeId) {
        return employeeDao.getEmployee(employeeId);
    }

    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    public void modifyEmployee(Employee employee){
        employeeDao.modifyEmployee(employee);
    }

    public void deleteEmployee(Integer employeeId) {
        employeeDao.deleteEmployee(employeeId);
    }
}