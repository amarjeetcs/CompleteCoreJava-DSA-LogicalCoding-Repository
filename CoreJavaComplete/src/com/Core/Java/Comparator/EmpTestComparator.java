package com.Core.Java.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpTestComparator {
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(101, "Sanjeet", "Pune", "40000", "Aimdek"));
		emp.add(new Employee(105, "Amarjeet", "Bangalore", "29000", "Edifecs"));
		emp.add(new Employee(102, "Rajnish", "Bangalore", "25000", "L&T"));
		emp.add(new Employee(104, "Rakesh", "Hyderabad", "27000", "Perfixion"));
		
		System.out.println("Before Sorting...");
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		System.out.println("After Sorting as SortById...");
		Collections.sort(emp,new SortEmpById());
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		System.out.println("SortByName");
		Collections.sort(emp, new SortByName());
		for(Employee em:emp)
		{
			System.out.println(em);
		}
		
	}

}
