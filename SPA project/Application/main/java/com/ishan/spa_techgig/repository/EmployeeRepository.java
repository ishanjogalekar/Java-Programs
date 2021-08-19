package com.ishan.spa_techgig.repository;

import com.ishan.spa_techgig.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JPA repository
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
