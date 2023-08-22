package com.Core.Java.ExceptionHandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
			
		}catch (Exception e) {
		 System.out.println("You can not do like this");
		}
		finally {
			System.out.println("this will always execute");
		}
	}
}
