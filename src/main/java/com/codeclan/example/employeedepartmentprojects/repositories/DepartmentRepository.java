package com.codeclan.example.employeedepartmentprojects.repositories;

import com.codeclan.example.employeedepartmentprojects.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
