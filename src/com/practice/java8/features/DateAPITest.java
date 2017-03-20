package com.practice.java8.features;

import java.text.SimpleDateFormat;

public class DateAPITest {

	public static void main(String[] args) {
		
		System.out.println(new java.util.Date());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
		System.out.println(dateFormat.format(new java.util.Date()));

	}

}
