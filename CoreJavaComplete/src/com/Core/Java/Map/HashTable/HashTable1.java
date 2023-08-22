package com.Core.Java.Map.HashTable;

import java.util.*;

public class HashTable1 {
	public static void main(String[] args) {
		
		Hashtable ht2=new Hashtable<>();
		ht2.put("one", "one");
		ht2.put("one", "ramu");
		ht2.put("three", 3);
	
		System.out.println(ht2);
		//HashTable default initial capacity is 11 and load factor is 0.75
		//HashTable is legecy class and it is synchronized.
		//HashTable does not allow any null key and null value 
		//HashTable uese HashTable data structure and extends Dictoniry class
		//Hetrogenious data is possible
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht2.put(1, "sunny");
		System.out.println(ht2);
	}

}
