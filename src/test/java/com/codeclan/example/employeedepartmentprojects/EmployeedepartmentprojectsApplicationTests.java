package com.codeclan.example.employeedepartmentprojects;

import com.codeclan.example.employeedepartmentprojects.models.Department;
import com.codeclan.example.employeedepartmentprojects.models.Employee;
import com.codeclan.example.employeedepartmentprojects.models.Project;
import com.codeclan.example.employeedepartmentprojects.repositories.DepartmentRepository;
import com.codeclan.example.employeedepartmentprojects.repositories.EmployeeRepository;
import com.codeclan.example.employeedepartmentprojects.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeedepartmentprojectsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Back-end");
		departmentRepository.save(department);

		Employee employee = new Employee("Ross", "Lorimer", 1, department);
		employeeRepository.save(employee);
	}


	@Test
	public void addEmployeesAndProjects(){
		Department department = new Department("Back-end");
		departmentRepository.save(department);

		Employee employee = new Employee("Ross", "Lorimer", 1, department);
		employeeRepository.save(employee);

		Employee employee1 = new Employee("Adrian", "Valdivia", 4, department);
		employeeRepository.save(employee1);

		Project project = new Project("Java Lab", 3);
		projectRepository.save(project);

		Project project1 = new Project("Javascript Lab", 15);
		projectRepository.save(project1);

		project.addEmployee(employee);
		projectRepository.save(project);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}



}
