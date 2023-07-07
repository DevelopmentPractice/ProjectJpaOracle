package edu.development.practice.jpaoracle.entity.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPLEADO")
public class Employee {
	
	@Id
	@SequenceGenerator(name="SEC_EMPLEADO", sequenceName="SEC_EMPLEADO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEC_EMPLEADO")
	private Integer ID;
	
	@Column(name = "PUESTO")
	private String position;
	
	@Column(name = "SUELDO")
	private Float salary;

}
