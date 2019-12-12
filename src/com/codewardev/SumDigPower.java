package com.codewardev;

// https://www.codewars.com/kata/take-a-number-and-sum-its-digits-raised-to-the-consecutive-powers-and-dot-dot-dot-eureka/train/java

import java.util.List;

public class SumDigPower {

	public static List<Long> sumDigPow(long a, long b) {
		
		for(long i=a; i<b; i++) {
			String iString = Long.toString(i);
			int sum = iString.chars()
					.map(x->Character.getNumericValue(x))
					.map(x->(int)Math.pow(Double.valueOf(x), Double.valueOf(iString.indexOf(x+"")+1))).sum();
			System.out.println("Sum of "+i+"="+sum);
		}
		
		return null;
	}

}
