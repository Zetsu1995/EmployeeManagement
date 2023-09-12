package com.zetsu.employee_management_project.service;

import com.zetsu.employee_management_project.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    String removeEmployee(int id);

    Optional<Employee> findEmpById(int id);

    List<Employee> getAllEmployee();

    String updateEmployee(int id);
}
