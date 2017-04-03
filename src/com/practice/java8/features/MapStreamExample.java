package com.practice.java8.features;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.groupingBy;
*/
import static java.util.stream.Collectors.*;
public class MapStreamExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "SahayS", "sahay@gmail.com", 35, LocalDate.now().withYear(1984).withMonth(12).withDayOfMonth(12));
		Employee e2 = new Employee(1002, "Neha", "neha@gmail.com", 32, LocalDate.now().withYear(1988).withMonth(12).withDayOfMonth(9));
		Employee e3 = new Employee(1003, "Aahana", "shan@gmail.com", 6, LocalDate.now().withYear(2011).withMonth(3).withDayOfMonth(27));
		Employee e4 = new Employee(1004, "Vedandh", "vaashu@gmail.com", 1, LocalDate.now().withYear(2016).withMonth(9).withDayOfMonth(29));

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		String empName = employees.stream().filter(e -> e.getAge() == 30).map(Employee::getEmpName).findAny().orElse("Nothing found");
		
		System.out.println(empName);
		
		String [] arrayOfWords = {"Hello", "World"};
		
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		
		List<Stream<String>> lsStreamStr = streamOfWords.map(word -> word.split(""))
				.map(Arrays::stream) //Flatten each generated stream into a single stream.
				.distinct()
				.collect(Collectors.toList());
		
		
		
		List<String> lsStr = streamOfWords.map(word -> word.split(""))
		.flatMap(Arrays::stream) //Flatten each generated stream into a single stream. And it will return 
		.distinct()
		.collect(toList());
		
		System.out.println(lsStr);
	}

}
