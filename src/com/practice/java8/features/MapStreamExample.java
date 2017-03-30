package com.practice.java8.features;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MapStreamExample {

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
		
		String empName = employees.stream().filter(e -> e.getAge() == 30).map(Employee::getEmpName).findAny().orElse("Nothing found");
		
		System.out.println(empName);
	}

}
