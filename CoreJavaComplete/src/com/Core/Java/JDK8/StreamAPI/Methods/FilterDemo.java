package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;
import java.util.stream.Collectors;
class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class FilterDemo {
	public static void main(String[] args) {
		List<Product> al=new ArrayList<Product>();
		al.add(new Product(101,"Laptop",50000));
		al.add(new Product(101,"Phone",40000));
		al.add(new Product(101,"Table",30000));
		al.add(new Product(101,"TV",50000));
		al.add(new Product(101,"Fan",60000));
		
		//al.stream().forEach(e->System.out.println(e.id+" "+e.name+" "+e.price));
		//al.stream().filter(e->e.price>30000).forEach(f->System.out.println(f.price));
		//al.stream().filter(e->e.price>30000 && e.price<60000).forEach(e->System.out.println(e.price));
		List<Product> ls=al.stream().filter(e->e.name.length()>3 &&e.name.length()<6).collect(Collectors.toList());
		
		System.out.println(ls);
		
	}

}
