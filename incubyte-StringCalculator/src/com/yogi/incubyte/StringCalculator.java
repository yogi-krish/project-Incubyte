package com.yogi.incubyte;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	
	public static int add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 0;
		}
		
		if(numbers.startsWith("//")) {
			String delimiter=numbers.charAt(2)+"";
			String numbers1=numbers.substring(4, numbers.length());
			return helper(numbers1, delimiter+"|\n");
		}
		
		else if(numbers.contains(",")) {
			return helper(numbers, ",|\n");
		}
		
		else {
			return to_Int(numbers);
		}
		
		
	}

	public static int to_Int(String str) {
		return Integer.parseInt(str);
	}
	
	public static int helper(String numbers, String delimiter) {
		
		String[] numbersArray = numbers.split(delimiter);
		int sum=0;
		List<Integer> negatives=new ArrayList<Integer>();
		for(String num:numbersArray) {
			sum += to_Int(num);
			if(to_Int(num)<0)
				negatives.add(to_Int(num));
		}
		
		if(negatives.size()>0) {
			throw new RuntimeException("negatives not allowed "+negatives.toString().replace("[", "").replace("]", ""));
		}
		return sum;
	}
}
