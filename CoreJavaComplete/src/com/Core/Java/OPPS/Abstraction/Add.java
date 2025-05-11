package com.Core.Java.OPPS.Abstraction;

import java.util.HashSet;

public class Add {
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("amarjeet");
		StringBuilder sb2=new StringBuilder("amarjeet");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		//StringBuilder two object is with amarjeet if i will put into the set then what will the output.
		//str1=amarjeet
		//str2=amarjeet
		//if you will add this in set then what will the output
		HashSet<String> hs=new HashSet<String>();
		hs.add(sb1.toString());
		hs.add(sb2.toString());
		System.out.println(hs);
		
		String str1=new String("sanjeet");
		String str2=new String("sanjeet");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
	}

}
