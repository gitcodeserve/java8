package com.practice.java8.features;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterStreamExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Shantanu Sahay", "sahay@gmail.com", 35, LocalDate.now().withYear(1981).withMonth(9).withDayOfMonth(9));
		Employee e2 = new Employee(1002, "Neha Sahay", "neha@gmail.com", 32, LocalDate.now().withYear(1984).withMonth(12).withDayOfMonth(9));
		Employee e3 = new Employee(1003, "Aahana Shan", "shan@gmail.com", 6, LocalDate.now().withYear(2011).withMonth(3).withDayOfMonth(27));
		Employee e4 = new Employee(1004, "Vedandh Shan", "vaashu@gmail.com", 1, LocalDate.now().withYear(2016).withMonth(9).withDayOfMonth(29));
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		List<Employee> filteredList = employees
										.stream().filter(e -> e.getAge() > 30)
										.collect(Collectors.toList());
		//System.out.println(filteredList);
		filteredList.forEach(System.out::println);
		
		Employee found = employees.stream().filter(e -> e.getEmpId() == 1004).findAny().orElse(null);
		
		Optional<Employee> found1 = employees.stream().filter(e -> e.getEmpId() == 1001).findAny();

		System.out.println(found.getEmpName());
		System.out.println(found1.isPresent());
		System.out.println(found1.get().getEmpName());
	}

}

