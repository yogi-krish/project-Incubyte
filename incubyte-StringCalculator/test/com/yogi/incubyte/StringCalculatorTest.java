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
	
	@Test
	public void testMultipleCharacters() {
		assertEquals(55, StringCalculator.add("1,2,3,4,5,6,7,8,9,10"));
	}
	
	@Test
	public void testwithNewLineDelimiter() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
}
