package com.practice.java8.features;

import java.time.LocalDate;

public class Employee {

	private int empId;
	private String empName;
	private String empEmail;
	private int age;
	private LocalDate empDOB;
	
	public Employee(){
		super();
	}
	
	
	
	public Employee(int empId, String empName, String empEmail, int age, LocalDate empDOB) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.age = age;
		this.empDOB = empDOB;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", age=" + age
				+ ", empDOB=" + empDOB + "]";
	}
	
	
	
}

