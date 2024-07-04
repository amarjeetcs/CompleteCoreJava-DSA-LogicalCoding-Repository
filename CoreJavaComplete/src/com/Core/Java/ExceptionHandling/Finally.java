package com.Core.Java.ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			System.out.println("This is try block");
			//finally will not execute using this
		}
		catch (Exception e) {
			System.out.println("This is catch block");
			System.exit(0); 
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}
