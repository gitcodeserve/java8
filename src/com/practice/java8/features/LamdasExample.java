package com.practice.java8.features;

import java.util.Arrays;
import java.util.List;

public class LamdasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lstString = Arrays.asList("Shantanu", "Kishore", "Sahay");
		System.out.println(lstString);
		
		lstString.forEach(System.out::print);
		//System.out.println();
		
		MyFunctionalInterface addition = (i, j) -> i + j;
		MyFunctionalInterface substraction = (i, j) -> i - j;
		MyFunctionalInterface multiplication = (i, j) -> i * j;
		
		
		
		System.out.println(addition.operation(10, 15));
		System.out.println(substraction.operation(20, 15));
		System.out.println(multiplication.operation(20, 15));
	}

}