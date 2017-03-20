package com.practice.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class FruitLamdaExample {
	public static void main(String ... args){
		Apple appleFruitRed1 = new Apple(1,"Red");
		Apple appleFruitRed2 = new Apple(2,"Green");
		Apple appleFruitRed3 = new Apple(3,"Dark Red");
		Apple appleFruitRed4 = new Apple(4,"Yellow");
		Apple appleFruitRed5 = new Apple(5,"Dark Yellow");
		
		
		List<Apple> appleLst = new ArrayList<>();
		
		appleLst.add(appleFruitRed1);
		appleLst.add(appleFruitRed2);
		appleLst.add(appleFruitRed3);
		appleLst.add(appleFruitRed4);
		appleLst.add(appleFruitRed5);
		
		Predicate<Apple> applePredicate = apple -> apple.getWeight() > 2;
		//Comparator<Apple> appleComparator = (Apple a1, Apple a2) -> a1.getWeight();
		
		List<Apple> heavyApples = heavyAppleList(appleLst, applePredicate);
		
		System.out.println("Heavy apples are " + heavyApples);
		for(Apple heavyApple : heavyApples){
			System.out.println(heavyApple.getColor() + " color apple weight is " + heavyApple.getWeight() + " kg." );
			
		}
		
	}

	private static List<Apple> heavyAppleList(List<Apple> appleLst, Predicate<Apple> applePredicate) {
		List<Apple> heavyAppleList = new ArrayList<>();
		for(Apple apple: appleLst){
			if(applePredicate.test(apple)){
				heavyAppleList.add(apple);
			}
		}
		return heavyAppleList;
		// TODO Auto-generated method stub
		
	}

}
