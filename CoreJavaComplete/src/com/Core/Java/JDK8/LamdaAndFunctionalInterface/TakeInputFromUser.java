package com.Core.Java.JDK8.LamdaAndFunctionalInterface;

import java.util.*;

interface TakeInput {
    void sum(int x, int y);
}

public class TakeInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();

        TakeInput t = (a,b) -> System.out.println("Sum of two numbers is: " + (x + y));
        t.sum(x, y);
    }
}
