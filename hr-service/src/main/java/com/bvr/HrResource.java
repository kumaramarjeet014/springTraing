package com.bvr;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")
public class HrResource {

	public HrResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Employee> employees = Arrays.asList(new Employee("E1", "emp1", "emp1", "cardiologist"),
			new Employee("E2", "emp2", "emp2", "dermatologist"),
			new Employee("E3", "emp3", "emp3", "chemist"));
	
	@RequestMapping("/employees")
	public EmployeeList getEmployee() {
		EmployeeList employeeList = new EmployeeList();
		
		employeeList.setEmployeeList(employees);
		
		return employeeList;
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		Employee e =  employees.stream()
				.filter(emp -> emp.getId().equals(id))
				.findAny().orElse(null);
		
		return e;
	}

}
