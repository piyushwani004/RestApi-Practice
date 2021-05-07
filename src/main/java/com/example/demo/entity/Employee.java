package com.example.demo.entity;

public class Employee {

	private long Id;
	private String Name;
	private double Salary;
	private String Dept;

	public Employee(long id, String name, double salary, String dept) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
		Dept = dept;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

}
