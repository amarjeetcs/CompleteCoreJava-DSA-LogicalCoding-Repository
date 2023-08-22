package com.Core.Java.ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		try {
			
			System.out.println("This is try block");
			System.exit(0); //finally will not execute using this
		}
		catch (Exception e) {
			System.out.println("This is catch block");
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}
