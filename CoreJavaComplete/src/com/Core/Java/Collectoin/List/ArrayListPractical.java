package com.Core.Java.Collectoin.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractical {
	public static void main(String[] args) {  //add(),size(),get(),set(),remove(),contains(),addAll(),isEmpty(),indexOf(),
											  //removeAll(),containsAll()
		ArrayList al=new ArrayList<>();
		al.add("amarjeeet");
		al.add(1);
		al.add(2);
		al.add('e');
		al.add(10.5);
		al.add(true);
		al.add(null);
		al.add(null);
		al.add("amarjeet");
		System.out.println("Before adding index: "+al); //[amarjeeet, 1, 2, e, 10.5, true]
		al.add(3, "sunny");
		System.out.println("after adding to index: "+al);//[amarjeeet, 1, 2, sunny, e, 10.5, true]
		System.out.println("total number of element in list: "+al.size());//7
		System.out.println("Printing 3rd index value: "+al.get(3)); //sunny
		al.set(3, "sunny sultan");
		System.out.println("updating value at 3rd index: "+al);//[amarjeeet, 1, 2, sunny sultan, e, 10.5, true]
		System.out.println("Removing 3rd index element: "+al.remove(3));//sunny sultan
		System.out.println(al.contains('e'));//true
		System.out.println(al.isEmpty());//false
		System.out.println(al.indexOf(1));
		
		//Traversing ways
		//1. using for loop
		System.out.println("Using for loop: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//using for each loop
		System.out.println("Using for each loop: ");
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		//using iterator
		System.out.println("Using iterator: ");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		al.clear();
		System.out.println(al);
		
		//ArrayList is child class of list interface which is used to stor the data in ordered mananer and duplicates
		//are allowed and null insertion too.
		//ArrayList default intial capacity is 10 and incresses its size by 50 percent.
		//it is methods are not synchronized
		//arraylist implemets random access interface
		ArrayList al1=new ArrayList<>();
		al1.add(1);
		al1.add("Amarjeet");
		al1.add(10.4);
		al1.add(true);//without generic type
		
		System.out.println("**************************");
		System.out.println(al1);
		
		
		//with generic type
		ArrayList<String> al2=new ArrayList<>();
		al2.add("amarjeet");
		al2.add("aniket");
		System.out.println(al2);
		System.out.println(al2.get(0));
		//al2.add("amarjeet");
		
		
		
		
	}
	
	
	
	

}
