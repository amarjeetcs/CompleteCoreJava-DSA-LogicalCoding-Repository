package com.java.logical.coding.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    private int id;
    private String name;
    private int age;
    private String company;
    private long salary;

    public SortEmployee(int id, String name, int age, String company, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.company = company;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "SortEmployee [id=" + id + ", name=" + name + ", age=" + age + ", company=" + company + ", salary="
                + salary + "]";
    }

    // Comparator for sorting by id
    public static Comparator<SortEmployee> IdComparator = new Comparator<SortEmployee>() {
        @Override
        public int compare(SortEmployee emp1, SortEmployee emp2) {
            return Integer.compare(emp1.getId(), emp2.getId());
        }
    };

    // Comparator for sorting by salary
    public static Comparator<SortEmployee> SalaryComparator = new Comparator<SortEmployee>() {
        @Override
        public int compare(SortEmployee emp1, SortEmployee emp2) {
            return Long.compare(emp1.getSalary(), emp2.getSalary());
        }
    };

    public static void main(String[] args) {
        List<SortEmployee> employees = new ArrayList<>();
        employees.add(new SortEmployee(104, "amarjeet", 23, "edifecs", 23000));
        employees.add(new SortEmployee(102, "sanjeet", 29, "edifecs", 24000));
        employees.add(new SortEmployee(101, "ramesh", 27, "edifecs", 27000));
        employees.add(new SortEmployee(106, "aniket", 24, "edifecs", 21000));
        
        // Sort by salary
        Collections.sort(employees, SortEmployee.SalaryComparator);
        System.out.println("\nSorting by Salary:");
        for (SortEmployee employee : employees) {
            System.out.println(employee);
        }

        // Sort by id
        Collections.sort(employees, SortEmployee.IdComparator);
        System.out.println("Sorting by ID:");
        for (SortEmployee employee : employees) {
            System.out.println(employee);
        }

      
    }
}
