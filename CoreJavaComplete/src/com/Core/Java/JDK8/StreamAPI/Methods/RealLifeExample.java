package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	String designation;
	String company;
	Double salary;

	String city;

	public Employee(int id, String name, String designation, String company, double salary, String city) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.company = company;
		this.salary = salary;

		this.city = city;
	}
}

public class RealLifeExample {
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		al.add(new Employee(101, "Amarjeet", "Java Developer", "Edifecs", 55000, "Bangalore"));
		al.add(new Employee(102, "Sanjeet", "Liferay Developer", "Aimdek", 55000, "Bihar"));
		al.add(new Employee(103, "Rajnish", "Java Developer", "L&T", 120000, "Bangalore"));
		al.add(new Employee(104, "Vishwjeet", "Welder", "Mahindra", 22000, "Pune"));
		al.add(new Employee(105, "Shubhendu", "Python Developer", "Virtusa", 33000, "UP"));
		//al.stream().forEach(e -> System.out
				//.println(e.id + " : " + e.name + " : " + e.designation + " : " + e.company + " : " + e.salary + " : " + e.city));
		//al.stream().filter(e->e.salary>50000 && e.salary<100000).forEach(e1->System.out.println(e1.salary));
		//al.stream().filter(e->e.name.equals("Amarjeet") && e.city.equals("Bangalore")).forEach(e->System.out.println(e.name+""+e.city));
		//al.stream().filter(e->e.salary==55000 && e.city.equals("Bangalore")).forEach(e->System.out.println(e.name));
		//List<String>list=al.stream().map(e->e.name).collect(Collectors.toList());
		//System.out.println(list);
		
		
		
		
	}

}
