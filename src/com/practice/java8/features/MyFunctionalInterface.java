package com.practice.java8.features;

//@FunctionalInterface
public interface MyFunctionalInterface {

	abstract int operation(int i, int j);
	
	//abstract String show();
	
	public default int operation(int i, int j, int k){return 1;}
}
