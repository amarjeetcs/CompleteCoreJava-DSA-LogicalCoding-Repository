package com.Core.Java.Collectoin.List;
import java.util.*;
public class VectorPractical {
	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add("amarjeet");
		v.add(10.23);
		v.add('c');
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		v.add(true);
		
	
		System.out.println(v);
		v.add(6);
		System.out.println(v);
		
		System.out.println(v.capacity());
		//vector is old class or legecy class
		//vector incresses its size by 100%
		//vector methods are synchronized
		//vector initial capacity is 10
		//use vector when our operation is to retrive the data drom list
		//vector implements random access interface
		
	}

}
