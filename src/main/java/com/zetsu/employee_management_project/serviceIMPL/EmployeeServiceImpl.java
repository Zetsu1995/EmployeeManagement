package com.zetsu.employee_management_project.serviceIMPL;
import com.zetsu.employee_management_project.model.Employee;
import com.zetsu.employee_management_project.repository.EmployeeRepo;
import com.zetsu.employee_management_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        Employee emp = employeeRepo.save(employee);
        return emp;
    }

    @Override
    public String removeEmployee(int id) {

        employeeRepo.deleteById(id);
        return "Delete Data Successfully";
    }

    @Override
    public Optional<Employee> findEmpById(int id) {
        Optional<Employee> empId = employeeRepo.findById(id);

        if(empId.isPresent()){
            return empId;
        }
        else {
            return Optional.empty();
        }
    }
    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> empList = employeeRepo.findAll();

        return empList;
    }

    @Override
    public String updateEmployee(int id) {
        Optional<Employee> empUpdate = employeeRepo.findById(id);

        if(empUpdate.isPresent()){

            Employee emps = new Employee();

            employeeRepo.save(emps);
            return "Updated Successfully";
        }
        else {

            return "Employee Not Found";
        }

    }

}
