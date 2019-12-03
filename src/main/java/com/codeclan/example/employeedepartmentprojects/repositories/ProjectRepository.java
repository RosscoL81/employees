package com.codeclan.example.employeedepartmentprojects.repositories;

import com.codeclan.example.employeedepartmentprojects.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
