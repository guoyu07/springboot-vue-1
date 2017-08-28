package com.example.dao;

import com.example.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jiangchong
 * @since 2017/8/23 9:11
 */
@Repository
public interface EmployeeDao {
    List<Employee> getEmployees();

    Employee getEmployee(Integer employeeId);

    void saveEmployee(Employee employee);

    void modifyEmployee(Employee employee);

    void deleteEmployee(Integer employeeId);
}
