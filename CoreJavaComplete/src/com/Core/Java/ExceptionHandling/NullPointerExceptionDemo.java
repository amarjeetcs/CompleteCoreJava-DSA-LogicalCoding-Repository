package com.Core.Java.ExceptionHandling;

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		/*String str=null;   //this will print null pointer exception without try catch block
		System.out.println(str.length());*/
		
		try {
			String str=null;
			System.out.println(str.length());
		}catch (NullPointerException e) {
			System.out.println("you can not find length on null value please give valid str name");
		}
	}
}
