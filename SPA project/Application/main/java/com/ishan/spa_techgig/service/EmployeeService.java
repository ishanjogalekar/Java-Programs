package com.ishan.spa_techgig.service;

import com.ishan.spa_techgig.model.Employee;
import org.springframework.data.domain.Page;
import java.util.List;

//Creating JPA data list
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
