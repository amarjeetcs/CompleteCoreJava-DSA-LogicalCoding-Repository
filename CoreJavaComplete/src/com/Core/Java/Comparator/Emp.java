package com.Core.Java.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Emp {
	private int id;
	private String name;
	private int age;

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
	
	Emp(int id, String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<>();
		list.add(new Emp(102,"Sanjeet",25));
		list.add(new Emp(107,"Amarjeet",24));
		list.add(new Emp(106,"Nisha",21));
		list.add(new Emp(101,"Nikki",24));
		list.add(new Emp(109,"Hira",22));
		System.out.println(list);
		Collections.sort(list,new IdComparator());
		System.out.println(list);
		
		ArrayList<Emp> list1=new ArrayList<>(list);
		Collections.sort(list1,new NameComparator());
		System.out.println(list1);
		
		//Comparator interface used to perform multisorting sequence
		//it is present in java.util package
		//it provides compare() method
		

	}
}