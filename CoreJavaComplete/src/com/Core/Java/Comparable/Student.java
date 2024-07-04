package com.Core.Java.Comparable;

import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	// Comparable interface in used to compare the based on single sorting sequence
	// Comparable interface present in java.lang package
	// Comparable interface have compareTo() method.
	// In Comparable you can sort single sorting

	/*
	 * public int compareTo(Student st) { return this.age-st.age; }
	 */

	/*
	 * public int compareTo(Student st) { return this.rollno-st.rollno; }
	 */

	/*
	 * public int compareTo(Student st) { return this.name.compareTo(st.name); }
	 */
	/*
	 * public int compareTo(Student s) { return this.rollno-s.rollno; }
	 */

	/*
	 * public int compareTo(Student st) { return this.age-st.age; }
	 */

	/*
	 * public int compareTo(Student s) { if (age == s.age) return 0; if (age <
	 * s.age) return -1; if (age > s.age) return 1; return age;
	 * 
	 * }
	 */
	
	public int compareTo(Student st)
	{
		if(this.age==st.age)
			return 0;
		else if(this.age>st.age)
			return 1;
		else if(this.age<st.age)
			return -1;			//here you can take any value insted of 0, 1 and -1 it should be positive and negative and zero
	
		return age;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "amarjeet", 23));
		al.add(new Student(104, "ranjeet", 20));
		al.add(new Student(103, "vikash", 25));
		System.out.println("before sorting");
		System.out.println("-----------------------");
		System.out.println(al);
		
		System.out.println("after sorting");
		System.out.println("-----------------------");
		Collections.sort(al);
		System.out.println(al);

	}
}
