package com.pe.ouracademy.myschool.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public @Data class Person {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
}