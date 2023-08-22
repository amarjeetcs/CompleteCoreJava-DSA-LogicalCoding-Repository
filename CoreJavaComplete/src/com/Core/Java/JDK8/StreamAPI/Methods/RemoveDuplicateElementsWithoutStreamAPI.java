package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;
public class RemoveDuplicateElementsWithoutStreamAPI {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("D");
		
		
		ArrayList al1=new ArrayList<>();
		for(String obj:al)
		{
			if(!al1.contains(obj))
			{
				al1.add(obj);
			}
		}
		System.out.println(al1);
	}
}
