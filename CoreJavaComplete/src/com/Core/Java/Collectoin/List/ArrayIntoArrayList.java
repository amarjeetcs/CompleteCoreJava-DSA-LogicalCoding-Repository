package com.Core.Java.Collectoin.List;
import java.util.*;


public class ArrayIntoArrayList {
	public static void main(String[] args) {
		String[] str= {"amarjeet","sanjeet","neha","hira","rajnish"};
		
		for(String s:str)
		{
			System.out.println(s);
		}
		ArrayList<String> al=new ArrayList<>(Arrays.asList(str));
		System.out.println("Array into arrayllist convert: "+al.getClass());
		for(String st:al)  //inhance for loop
		{
			System.out.println(st);
		}
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
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println("using iterator:"+itr.next());
		}
		
		System.out.println("_________________________________");
		ListIterator<String> Litr=al.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
	}

}
