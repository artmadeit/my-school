package com.pe.ouracademy.myschool;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Category(SmokeTest.class)
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}

interface SmokeTest {}
