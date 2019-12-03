package com.codeclan.example.employeedepartmentprojects.repositories;

import com.codeclan.example.employeedepartmentprojects.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
