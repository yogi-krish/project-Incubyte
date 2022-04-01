package com.yogi.incubyte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testSingleCharacter() {
		assertEquals(2, StringCalculator.add("2"));
	}
	
	@Test
	public void testTwoCharacters() {
		assertEquals(3, StringCalculator.add("1,2"));
	}

}
