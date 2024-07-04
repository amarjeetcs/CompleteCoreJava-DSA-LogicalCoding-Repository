package com.Core.Java.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmpTest{

	
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101, "Ram", "Pune", "29000"));
		al.add(new Employee(104, "Shyam", "Kolkata", "28000"));
		al.add(new Employee(103, "Sita", "Lankapuri", "23000"));
		al.add(new Employee(102, "Bharat", "Ayodha", "43000"));
		
		Collections.sort(al);
		System.out.println(al);
	}

}