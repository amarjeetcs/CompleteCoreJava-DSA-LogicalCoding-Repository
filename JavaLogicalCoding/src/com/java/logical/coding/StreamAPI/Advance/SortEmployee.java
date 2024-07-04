package com.java.logical.coding.StreamAPI.Advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee implements Comparator<SortEmployee> {
	private int id;
	private String name;
	private int age;
	private String company;
	private long salary;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SortEmployee [id=" + id + ", name=" + name + ", age=" + age + ", company=" + company + ", salary="
				+ salary + "]";
	}

	public SortEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SortEmployee(int id, String name, int age, String company, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.company = company;
		this.salary = salary;
	}

	

	@Override
	public int compare(SortEmployee o1, SortEmployee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}

}
