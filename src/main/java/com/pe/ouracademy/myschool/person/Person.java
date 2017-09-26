package com.pe.ouracademy.myschool.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Person {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
}