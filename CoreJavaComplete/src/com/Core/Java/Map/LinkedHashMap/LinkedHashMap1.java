package com.Core.Java.Map.LinkedHashMap;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMap1 {
	public static void main(String[] args) {
		 LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  hm.put(103, "rajeet");
		  hm.put(null, null);
		  //LinkedHashMap:
			 // ->LinkedHashMap extend HashMap class.
			 // ->LinkedHashMap insertion order is preserved.
			 // ->Default initial capacity is 16 and load factor is 0.75%.
		  System.out.println(hm);
		  for(Map.Entry m:hm.entrySet())
		  {
			  System.out.println(m.getKey()+" : "+m.getValue());
		  }
		
	}

}
