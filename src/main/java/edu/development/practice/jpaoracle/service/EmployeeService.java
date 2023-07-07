package edu.development.practice.jpaoracle.service;

import edu.development.practice.jpaoracle.entity.employee.Employee;
import edu.development.practice.jpaoracle.request.employee.EmployeeRequest;

public interface EmployeeService {

	Employee insert(EmployeeRequest request);

	Employee get(String id);
	
	String update();
	
	String delete();

}
