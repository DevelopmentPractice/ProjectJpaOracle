package edu.development.practice.jpaoracle.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.development.practice.jpaoracle.entity.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
