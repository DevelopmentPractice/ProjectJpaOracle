package edu.development.practice.jpaoracle.service.impl;

import org.springframework.stereotype.Service;

import edu.development.practice.jpaoracle.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public String insert() {
		return "Insert Person Service";
	}

	@Override
	public String get() {
		return "Get Person Service";
	}

	@Override
	public String update() {
		return "Update Person Service";
	}

	@Override
	public String delete() {
		return "Delete Person Service";
	}

}
