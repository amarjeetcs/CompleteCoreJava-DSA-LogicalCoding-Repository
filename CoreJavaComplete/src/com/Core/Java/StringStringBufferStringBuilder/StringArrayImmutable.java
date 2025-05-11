package com.Core.Java.StringStringBufferStringBuilder;

public class StringArrayImmutable {
    public static void main(String[] args) {
        // Create a String array with initial values
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Store the original value at index 1 in a separate variable
        String originalValueAtIndex1 = fruits[1];

        // Print the original array
        System.out.println("Original array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Change the value at a specific index
        fruits[1] = "Blueberry";  // Changing "Banana" to "Blueberry"

        // Print the modified array
        System.out.println("\nModified array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Print the original value of the modified element
        System.out.println("\nOriginal value at index 1: " + originalValueAtIndex1);
      
    }
}
