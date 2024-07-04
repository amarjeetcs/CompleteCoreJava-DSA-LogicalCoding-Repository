package com.Core.Java.LogicalCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private String city;
    private long salary;
    private String company;

    public Employee(int id, String name, String city, long salary, String company) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.company = company;
    }

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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", company="
                + company + "]";
    }

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(105, "amarjeet", "bangalore", 26000, "edifecs"));
        emp.add(new Employee(103, "sanjeet", "pune", 24000, "aimdek"));
        emp.add(new Employee(108, "rajeev", "patna", 24000, "aimdek"));
        emp.add(new Employee(102, "vishwjeet", "pune", 27000, "mahindra"));
        emp.add(new Employee(101, "rajnish", "bangalore", 21000, "L&T"));
        emp.add(new Employee(104, "amit", "patna", 24000, "edifecs"));

        // Finding the second highest salary using streams
        Optional<Employee> secondHighestSalaryEmp = emp.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

       System.out.println(secondHighestSalaryEmp);
       if(secondHighestSalaryEmp.isPresent())
       {
    	   Employee employee=secondHighestSalaryEmp.get();
    	   System.out.println(employee.getSalary());
       }
       
       //find the name of employee who is living in pune
       List<String> whoLivingInPune=emp.stream().filter(e->e.getCity().equalsIgnoreCase("pune")).map(Employee::getName).collect(Collectors.toList());
       System.out.println(whoLivingInPune);
       
       //find the name of employee who is working at edifecs
       List<String> workingAtEdifecs=emp.stream().filter(e->e.getCompany().equalsIgnoreCase("Edifecs")).map(Employee::getName).collect(Collectors.toList());
       System.out.println(workingAtEdifecs);
       
       //find the name of the employee who is working at edifecs as well as aimdek
       List<String> ls=emp.stream().filter(e->e.getCompany().equalsIgnoreCase("Edifecs") || e.getCompany().equalsIgnoreCase("Aimdek")).map(Employee::getName).collect(Collectors.toList());
       System.out.println(ls);
       
    }
}
