package com.deloitte.corejava.training.collection;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	transient private double salary;
	private double bonus;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Id: " + this.getId() + " Name: " + this.getName() + " salary: " + this.getSalary();
	}

	@Override
	public int compareTo(Employee emp) {
		return emp.name.compareTo(this.getName());
		/*
		 * if (this.id == emp.getId()) { return 0; } else if (this.id > emp.id) { return
		 * -1; }else { return 1; }
		 */
	}

}
