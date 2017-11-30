package com.pe.ouracademy.myschool.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.ouracademy.myschool.person.AllPeople;
import com.pe.ouracademy.myschool.person.Person;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/people")
@AllArgsConstructor
public class PeopleCollection {
	
	private final AllPeople allPeople;
	
	@GetMapping
	Iterable<Person> getPeople() {
		return this.allPeople.findAll();
	}
	
}
