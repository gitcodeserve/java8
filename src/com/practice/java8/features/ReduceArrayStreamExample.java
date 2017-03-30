package com.practice.java8.features;

import java.util.Arrays;

public class ReduceArrayStreamExample {

	public static void main(String[] args) {
		String[] myArray = { "this", "is", "a", "sentence" };
		String result = Arrays.stream(myArray)
		                .reduce("", (a,b) -> a + b);
		
		System.out.println(result);
	}

}
