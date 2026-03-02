package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {
	
	Junit j = new Junit();
	@Test
	void revTest() {
		assertEquals("bed", j.rev("deb"));
	}

}
