package com.Core.Java.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Emp implements Comparable<Emp> {
	private int id;
	private String name;
	private int age;

	public Emp(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Emp o) {
		return this.id - o.id;
	}

	

}
