package com.yogi.incubyte;

public class StringCalculator {
	
	public static int add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 0;
		}
		
		if(numbers.startsWith("//")) {
			String delimiter=numbers.charAt(2)+"";
			String numbers1=numbers.substring(4, numbers.length());
			String[] numbersArray=numbers1.split(delimiter);
			int sum=0;
			for(String num:numbersArray) {
				sum += to_Int(num);
			}
			
			return sum;
		}
		
		else if(numbers.contains(",")) {
			String[] numbersArray = numbers.split(",|\n");
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
