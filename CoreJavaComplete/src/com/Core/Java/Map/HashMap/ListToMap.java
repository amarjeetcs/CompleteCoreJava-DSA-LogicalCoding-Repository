package com.Core.Java.Map.HashMap;

import java.util.ArrayList;
import java.util.List;

public class ListToMap {
	int id;
	String name;
	String city;
	String college;
	
	ListToMap(int id, String name, String city,String college)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.college=college;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "ListToMap [id=" + id + ", name=" + name + ", city=" + city + ", college=" + college + "]";
	}




	public static void main(String[] args) {
		List<ListToMap> ls=new ArrayList<>();
		ls.add(new ListToMap(1,"amarjeet","banglore","ies college bhopal"));
		ls.add(new ListToMap(2,"amarjeet","banglore","ies college bhopal"));
		ls.add(new ListToMap(3,"amarjeet","banglore","ies college bhopal"));
		ls.add(new ListToMap(4,"amarjeet","banglore","ies college bhopal"));
		ls.add(new ListToMap(5,"amarjeet","banglore","ies college bhopal"));
		
		System.out.println(ls);
		
		
	
	}
}
