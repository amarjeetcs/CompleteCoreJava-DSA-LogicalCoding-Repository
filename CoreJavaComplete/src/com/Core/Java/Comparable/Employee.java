package com.Core.Java.Comparable;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String city;
	private String salary;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String city, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getId()==o.getId())
			return 0;
		else if(this.getId()>o.getId())
			return 1;
		else if(this.getId()<o.getId())
			return -1;
		return id;
	}

}
