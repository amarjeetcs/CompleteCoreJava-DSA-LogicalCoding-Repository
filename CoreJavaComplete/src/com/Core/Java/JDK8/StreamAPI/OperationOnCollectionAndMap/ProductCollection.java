package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;
import java.util.*;
public class ProductCollection {
	int id;
	String name;
	int age;
	String city;
	double salary;
	String country;
	
	ProductCollection(int id,String name,int age,String city,double salary,String country){
		this.id=id;
		this.name=name;
		this.age=age;
		this.city=city;
		this.salary=salary;
		this.country=country;
		
		
		
	}
	public static void main(String[] args) {
		ArrayList<ProductCollection> pl=new ArrayList<>();
		pl.add(new ProductCollection(101,"Amarjeet",22,"Bangalore",25000,"India"));
		pl.add(new ProductCollection(102,"Sanjeet",23,"Bihar",28000,"India"));
		pl.add(new ProductCollection(103,"Rajnish",28,"Bangalore",65000,"India"));
		pl.add(new ProductCollection(104,"Hira",21,"Pune",18000,"India"));
		pl.add(new ProductCollection(105,"Amit",24,"Bangalore",27000,"India"));
		
		for(Object obj:pl)
		{
			System.out.println(obj);
		}
		
		
	}

}
