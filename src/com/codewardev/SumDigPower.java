package com.codewardev;

// https://www.codewars.com/kata/take-a-number-and-sum-its-digits-raised-to-the-consecutive-powers-and-dot-dot-dot-eureka/train/java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumDigPower {

	public static List<Long> sumDigPow(long a, long b) {
		List<Long> result = new ArrayList<Long>();
		
		LongStream.range(a, b).boxed().forEach(i->{
			String[] iArray = Long.toString(i).split("");
			if(i==IntStream.range(0, iArray.length)
					.map(x->(int) Math.pow(Double.valueOf(iArray[x]), Double.valueOf(x)+1))
					.sum()) result.add(i);
		});
		
		return result;
	}

}
