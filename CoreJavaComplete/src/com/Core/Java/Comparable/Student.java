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

	public int compareTo(Student st) {
		return this.name.compareTo(st.name);
	}

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
			
		}
		
	}
}
