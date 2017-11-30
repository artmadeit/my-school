package com.pe.ouracademy.myschool.person;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTests {
	Person somePerson = new Person(1L, "Arthur", "Mauricio");
	
	@Test
	public void testId() {
		assertEquals(1L, somePerson.getId().longValue());
		somePerson.setId(2L);
		assertEquals(2L, somePerson.getId().longValue());
	}
	
	@Test
	public void testFirstName() {
		assertEquals("Arthur", somePerson.getFirstName());
		somePerson.setFirstName("new name");
		assertEquals("new name", somePerson.getFirstName());
	}
	
	@Test
	public void testLastName() {
		assertEquals("Mauricio", somePerson.getLastName());
		somePerson.setLastName("new last name");
		assertEquals("new last name", somePerson.getLastName());
	}
}
