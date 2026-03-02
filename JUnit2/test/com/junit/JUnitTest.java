package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JUnitTest {
	
	Junit j = new Junit();
	
	@BeforeEach
	public void start() {
		System.out.println("Before each");
	}

	@Test
	void addTest() {
		int actual  = j.add(2, 4);
		int predicted = 6;
		assertEquals(predicted, actual);
	}
	
	@Test
	void addTest1() {
		int actual  = j.add(2, 4);
		int predicted = 7;
		assertEquals(predicted, actual);
	}
	
	@Test
	void mulTest() {
		assertEquals(8, j.mul(2, 4));
	}
	
	@Test
	void evenTest() {
		assertEquals(true, j.isEven(4));
	}
	
	@Test
	void arrayTest() 
	{
		int[] actual = j.array();
		int[] expected = {1, 2, 3, 4};
		assertArrayEquals(actual, expected);
	}
	@Test
	void arrayTest1() 
	{
		try {
			int[] arr = null;
			
			for(int i = 0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
