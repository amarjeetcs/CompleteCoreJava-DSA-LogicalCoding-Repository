package com.Core.Java.Collectoin.List;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;


public class ArrayIntoArrayList {
	public static void main(String[] args) {
		String[] str= {"amarjeet","sanjeet","neha","hira","rajnish"};
		ArrayList<Integer> al=new ArrayList();
		al.add(4);
		al.add(3);
		al.add(1);
		al.add(6);
		al.add(2);
		al.add(8);
	
		//how many ways we can traverse or iterate the arrayList in collection
		System.out.println("first way to print");
		for(int i=0;i<al.size();i++)
		{
			System.out.println("traversing with for loop: "+al.get(i));
		}
		
		
		
		System.out.println("second way to print");
		for(Integer i:al)
		{
			System.out.println("with forEach loop: "+i);
		}
		
		System.out.println("third way to print");
		al.forEach(e->System.out.println("with lambda and enhance for loop: "+e));
		
		System.out.println("forth way to print");
		al.stream().forEach(e->System.out.println("with the lambda and stream api and enhance for loop: "+e));
		
		System.out.println("fifth way to print");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println("with iterator cursor: "+itr.next());
		}
		
		System.out.println("six way to print");
		ListIterator<Integer> lstr=al.listIterator();
		while(lstr.hasNext())
		{
			System.out.println("using list iterator: "+lstr.next());
		}
		System.out.println("----------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(String s:str)
		{
			System.out.println(s);
		}
		System.out.println("______________________________________________________");
//		ArrayList<String> al=new ArrayList<>(Arrays.asList(str));
//		System.out.println("Array into arrayllist convert: "+al.getClass());
//		for(String st:al)  //inhance for loop
//		{
//			System.out.println(st);
//		}
		System.out.println("_________________________________");
		for(int i=0;i<str.length;i++)   //simple for loop
		{
			System.out.println(str[i]);
		}
		System.out.println("_________________________________");
		al.forEach(e->System.out.println("using foreach loop:"+e));
		
		System.out.println("_________________________________");
		al.stream().forEach(e->System.out.println(e));
		
		System.out.println("_________________________________");
		
		
	}

}
