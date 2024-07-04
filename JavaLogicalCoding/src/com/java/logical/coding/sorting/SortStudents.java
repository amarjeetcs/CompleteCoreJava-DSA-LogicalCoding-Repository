package com.java.logical.coding.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudents implements Comparable<SortStudents> {
	String name;
	int age;
	String city;
	long salary;

	public SortStudents(String name, int age, String city, long salary) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SortStudents [name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}

	public int compareTo(SortStudents st)
	{
		return this.city.compareTo(st.city);
//		return this.name.compareTo(st.name);
//		if(this.salary==st.salary)
//			return 0;
//		else if(this.salary<st.salary)
//			return -1;
//		else if(this.salary>st.salary)
//			return 1;
//		return 1;
//		if(this.age==st.age)
//		{
//			return 0;
//		}
//		else if(this.age>st.age)
//		{
//			return 1;
//		}
//		else if(this.age<st.age)
//		{
//			return -1;
//		}
//		return age;
		
		
	}

	public static void main(String[] args) {
		List<SortStudents> list = new ArrayList<>();
		list.add(new SortStudents("amarjeet", 23, "pune", 30000));
		list.add(new SortStudents("ramesh", 22, "nepal", 24000));
		list.add(new SortStudents("ram", 20, "patna", 26000));
		list.add(new SortStudents("sanjeet", 25, "siwan", 34000));
		
		Collections.sort(list);
		for (SortStudents sortStudents : list) {
			System.out.println(sortStudents);
		}
	}
	
}
