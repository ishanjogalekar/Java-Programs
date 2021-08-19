package com.ishan.spa_techgig.service;
import java.util.*;

import com.ishan.spa_techgig.model.Employee;
import com.ishan.spa_techgig.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;

//Service to fetch data and display including sorting function
@Service
public class EmployeeServiceImp1 implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        this.employeeRepository.save(employee);

    }

    @Override
    public Employee getEmployeeById(Long id) {
        // TODO Auto-generated method stub
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found by id: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        // TODO Auto-generated method stub
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        // TODO Auto-generated method stub
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
                : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.employeeRepository.findAll(pageable);
    }

}
