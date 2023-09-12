package com.zetsu.employee_management_project.repository;
import com.zetsu.employee_management_project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{

}
