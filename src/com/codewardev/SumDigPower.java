package com.codewardev;

//https://www.codewars.com/kata/take-a-number-and-sum-its-digits-raised-to-the-consecutive-powers-and-dot-dot-dot-eureka/train/java

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

	public static List<Long> sumDigPow(long a, long b) {
		List<Long> result = new ArrayList<Long>();
		for(long i=a; i<=b; i++) {
			String iString = Long.toString(i);
			int sum = 0;
			for(int j=0; j<iString.length(); j++) {
				String[] iArray = iString.split("");
				sum += Math.pow(Double.valueOf(iArray[j]), Double.valueOf(j)+1);
			}
			if(i==sum) {
				System.out.println("Found for "+i+"="+sum);
				result.add(i);
			}
		}
		
		return result;
	}

}
