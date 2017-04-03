package com.practice.java8.features;

import java.util.Arrays;
import java.util.Optional;

public class ReduceArrayStreamExample {

	public static void main(String[] args) {
		String[] myArray = { "this", "is", "a", "sentence" };
		String result = Arrays.stream(myArray)
		                .reduce("", (a,b) -> a + b);
		
		System.out.println(result);
		
		Integer [] intArray = {1,2,3,4,5};
		Optional<Integer> min = Arrays.stream(intArray).reduce(Integer::max);
		System.out.println(min.get());
		int sum = Arrays.stream(intArray).reduce(1, Integer::sum);
		System.out.println("Sum of number "  + sum);
		Optional<Integer> sum1 = Arrays.stream(intArray).reduce((a,b) -> (a*b));
		System.out.println("multiplication of number "  + sum1);
	}

}
