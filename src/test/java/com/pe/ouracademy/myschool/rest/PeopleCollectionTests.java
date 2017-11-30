package com.pe.ouracademy.myschool.rest;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.pe.ouracademy.myschool.person.AllPeople;
import com.pe.ouracademy.myschool.person.Person;

@WebMvcTest(PeopleCollection.class)
@RunWith(SpringRunner.class)
public class PeopleCollectionTests {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	AllPeople allPeople;
	
	@Test
	public void testGetPeople() throws Exception {
		when(this.allPeople.findAll())
			   .thenReturn(Arrays.asList(new Person(1L, "Arthur", "Mauricio")));
		
		this.mockMvc.perform(get("/people"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
			.andExpect(jsonPath("@.[0].id", equalTo(1)))
			.andExpect(jsonPath("@.[0].firstName", equalTo("Arthur")))
			.andExpect(jsonPath("@.[0].lastName", equalTo("Mauricio")));
	}
}
