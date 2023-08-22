package com.Core.Java.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Emp implements Comparable<Emp>{
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

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp(102,"Amarjeet",24));
		al.add(new Emp(105,"Sanjeet",25));
		al.add(new Emp(103,"Hira",23));
		al.add(new Emp(107,"Rajnish",28));
		al.add(new Emp(106,"Amit",21));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		

	}

	/*
	 * public int compareTo(Emp o) { return this.id-o.id; }
	 */
	
	/*
	 * public int compareTo(Emp o) { return this.age-o.age; }
	 */
	
	public int compareTo(Emp o) {
		return this.name.compareTo(name);
	}

}
