
package com.java.logical.jdk8.coding;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Using Stream API to filter even numbers and then sum them
        int evenSum = Arrays.stream(numbers)
                            .filter(num -> num % 2 == 0) // Filter even numbers
                            .reduce(0, Integer::sum);    // Sum the filtered numbers

        System.out.println("Sum of even numbers: " + evenSum);
        
        String str=null;
        if(str==null)
        {
        	System.out.println("value is null");
        }
        else {
        	System.out.println("enter valid valie");
        }
        
    }
}
