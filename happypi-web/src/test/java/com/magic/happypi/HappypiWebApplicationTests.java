package com.magic.happypi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.spring4.SpringTemplateEngine;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HappypiWebApplicationTests {


	@Autowired
	private SpringTemplateEngine templateEngine;

	@Test
	public void contextLoads() {

		System.out.println(1);
	}

}
