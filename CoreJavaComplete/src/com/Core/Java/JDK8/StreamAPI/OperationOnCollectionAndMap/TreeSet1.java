package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;

import java.util.*;
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(5);
		//t.add(true);
		//t.add(null);
		
		//TreeSet insertion order is not preserved but stored data in ascending order default
		//null insertion is not possible
		//duplicates are now allowed
		//hetrogenious data is not allowed
		System.out.println(t);
	}
}
