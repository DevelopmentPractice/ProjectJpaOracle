package edu.development.practice.jpaoracle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.development.practice.jpaoracle.service.PersonService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/person/crud")
public class PersonController {
	
	private final PersonService personService;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<String> insert() {
		return new ResponseEntity<>(personService.insert(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/get")
	public ResponseEntity<String> get() {
		return new ResponseEntity<>(personService.get(), HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<String> update() {
		return new ResponseEntity<>(personService.update(), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete")
	public ResponseEntity<String> delete() {
		return new ResponseEntity<>(personService.delete(), HttpStatus.OK);
	}

}
