package com.yogi.incubyte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

}
