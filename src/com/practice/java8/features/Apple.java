package com.practice.java8.features;

public class Apple implements Fruit {
	
	private int weight;
	private String color;
	
	public Apple(int weight, String color){
		this.weight = weight;
		this.color = color;
	}
	

	public int getWeight() {
		return weight;
	}



	public String getColor() {
		return color;
	}


	@Override
	public Fruit getFruit() {
		// TODO Auto-generated method stub
		return null;
	}

}
