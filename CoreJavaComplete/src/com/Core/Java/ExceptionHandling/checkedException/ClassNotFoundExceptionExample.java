package com.Core.Java.ExceptionHandling.checkedException;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) throws Exception{
        Class.forName("com.nonexistent.Class"); // Throws ClassNotFoundException
    }
}