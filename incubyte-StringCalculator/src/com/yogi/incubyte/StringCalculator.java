package com.yogi.incubyte;

public class StringCalculator {
	
	public static int add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 0;
		}
		
		else if(numbers.contains(",")) {
			String[] numbersArray = numbers.split(",");
			int sum=0;
			for(String num:numbersArray) {
				sum += to_Int(num);
			}
			return sum;
		}
		
		else {
			return to_Int(numbers);
		}
	}

	public static int to_Int(String str) {
		return Integer.parseInt(str);
	}
}
