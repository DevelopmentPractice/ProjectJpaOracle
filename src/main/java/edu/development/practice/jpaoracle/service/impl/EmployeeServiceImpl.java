package edu.development.practice.jpaoracle.service.impl;

import edu.development.practice.jpaoracle.entity.employee.Employee;
import edu.development.practice.jpaoracle.request.employee.EmployeeRequest;
import org.springframework.stereotype.Service;

import edu.development.practice.jpaoracle.repository.employee.EmployeeRepository;
import edu.development.practice.jpaoracle.service.EmployeeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Override
	public Employee insert(EmployeeRequest request) {
		Employee employee = Employee.builder()
				.salary(request.getSalary())
				.position(request.getPosition())
				.build();

		return employeeRepository.save( employee);
	}

	@Override
	public Employee get(String id) {
		return employeeRepository.findById(Integer.parseInt(id)).orElseThrow(() -> new RuntimeException("El Registro no Existe"));
	}

	@Override
	public String update() {
		return "Update Employee Service";
	}

	@Override
	public String delete() {
		return "Delete Employee Service";
	}

}
