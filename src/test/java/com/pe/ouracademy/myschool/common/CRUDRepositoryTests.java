package com.pe.ouracademy.myschool.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pe.ouracademy.myschool.person.AllPeople;
import com.pe.ouracademy.myschool.person.Person;

@DataJpaTest
@RunWith(SpringRunner.class)
//Tests for custom CRUD Repository using a human interface way
public class CRUDRepositoryTests {
	@Autowired
	private AllPeople allPeople;
	
	@Test
	public void testAdd() {
		Person arthur = allPeople.add(new Person(null, "Arthur", "Mauricio"));
		assertEquals("Arthur", arthur.getFirstName());
		assertEquals("Mauricio", arthur.getLastName());
		assertNotNull(arthur.getId());		
	}

}
