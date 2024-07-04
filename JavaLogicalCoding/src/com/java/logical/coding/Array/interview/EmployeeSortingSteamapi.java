package com.java.logical.coding.Array.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortingSteamapi implements Comparable<EmployeeSortingSteamapi>{
	int id;
	String name;
	long salary;

	public EmployeeSortingSteamapi(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "EmployeeSortingSteamapi [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		ArrayList<EmployeeSortingSteamapi> AL=new ArrayList<EmployeeSortingSteamapi>();
		AL.add(new EmployeeSortingSteamapi(101, "amarjeet", 4000));
		AL.add(new EmployeeSortingSteamapi(103, "ramesh", 5000));
		AL.add(new EmployeeSortingSteamapi(102, "sanju", 3000));
		//101,102,103
		
		 AL.forEach(System.out::println); System.out.println("-----------------");
		 AL.stream().sorted(Comparator.comparingLong(e->e.id)).forEach(System.out::
		 println);
		 
		
		AL.forEach(e->System.out.println(e));
		System.out.println("----------------");
		Collections.sort(AL);
		AL.forEach(System.out::println);
		
		
		List<Integer> al=Arrays.asList(1,1,2,3,4,5,5,6,7);  //1,1,2,3,4,5,5,6,7
		List<Integer> al1=al.stream().distinct().collect(Collectors.toList());//1,2,3,4,5,6,7
		System.out.println(al1);
		
		List<Integer> all=Arrays.asList(1,2,3,4,5,6,7); //1,2,3,4,5,6,7
		int a=all.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();//2,4,6=12
		System.out.println(a);
		
		
		//1,2,3,4,5
		
		//2,4,6,8,10

		List<Integer> listBeta=al1.stream().map(e->e*2).collect(Collectors.toList());
		System.out.println(listBeta);
		
		//map vs flatmap
		
		
		
	}


	@Override
	public int compareTo(EmployeeSortingSteamapi o) {
		if(this.id==o.id)
			return 0;
		else if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
	
		return id;
	}
	
	
}
