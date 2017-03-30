package com.practice.java8.features;

import java.util.Arrays;

public class ArrayStreamExample {

	public static void main(String[] args) {
		int myArray[] = { 1, 5, 8 };
		//reduction terminal operation.
		int sum = Arrays.stream(myArray).sum();

		System.out.println(sum);
	}

}
