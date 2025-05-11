package com.Core.Java.Collectoin.Set;
import java.util.*;
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<>();
		t.add(5);
		t.add(4);
		t.add(3);
		t.add(2);
		t.add(1);
		
//		t.add(null);
//		t.add(1);
		System.out.println(t);
		//hetrogenious data is not allowed other wise you will get class caste exception
		
		//null insertion is not possible if you will insert null then you will get 
		//NullPointerException 
		
		//store data in asceding  order 
		//uses self balancing data structure
		//implements sortedSet interface
		
 	}
}
