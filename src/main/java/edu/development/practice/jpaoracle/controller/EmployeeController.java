package edu.development.practice.jpaoracle.controller;

import edu.development.practice.jpaoracle.entity.employee.Employee;
import edu.development.practice.jpaoracle.request.employee.EmployeeRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import edu.development.practice.jpaoracle.service.EmployeeService;
import lombok.AllArgsConstructor;


@Validated
@RestController
@AllArgsConstructor
@RequestMapping(value = "/employee/crud")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<Employee> insert(@RequestBody EmployeeRequest request) {
		return new ResponseEntity<>(employeeService.insert(request), HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Employee> get(@PathVariable(name = "id") String id) {
		return new ResponseEntity<>(employeeService.get(id), HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<String> update() {
		return new ResponseEntity<>(employeeService.update(), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete")
	public ResponseEntity<String> delete() {
		return new ResponseEntity<>(employeeService.delete(), HttpStatus.OK);
	}

}
