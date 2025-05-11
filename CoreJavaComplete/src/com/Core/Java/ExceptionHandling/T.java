package com.Core.Java.ExceptionHandling;

public class T {
    public static void checkAge(int age) {
        if (age < 18) {
            // Explicitly throwing an exception
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("Welcome! You are eligible.");
        }
    }

    public static void main(String[] args) {
    	try {
    		 checkAge(15);  // This will throw an exception
    	}catch(Exception e)
    	{
    	System.out.println("Exception Hndler");	
    	}
       
    }
}
