package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
class SimpleControllerTest {

	@Autowired
	SimpleController simpleController;
	
	@Test
	void testSayHello() {
		//fail("Not yet implemented");
		String result = simpleController.sayHello();
		assertEquals("Welcome to spring", result);
	}}
