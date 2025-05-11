package com.Core.Java.ExceptionHandling;

//Custom exception class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class T1 {
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         // Throwing a custom exception
         throw new InvalidAgeException("Age must be 18 or above.");
     } else {
         System.out.println("Welcome! You are eligible.");
     }
 }

 public static void main(String[] args) {
     try {
         checkAge(15);  // This will throw a custom exception
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
