package com.pe.ouracademy.myschool.person;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class JPAMappingTests {
	@Autowired
	TestEntityManager testEntityManager;
	
	@Test
	public void testMapping() {
		Person somePerson  = testEntityManager.persistFlushFind(new Person(null, "Arthur", "Mauricio"));
		assertEquals("Arthur", somePerson.getFirstName());
		assertEquals("Mauricio", somePerson.getLastName());
		assertNotNull(somePerson.getId());
	}
}
