package com.example.codeclan.employeeData;

import com.example.codeclan.employeeData.models.Employee;
import com.example.codeclan.employeeData.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDataApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void getAllEmployees(){
		Employee employee = new Employee("Jackie Weaver", 63, 1, "JackieWee@gmail.com");
		employeeRepository.save(employee);
	}
}
