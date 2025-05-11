package com.Core.Java.ExceptionHandling.checkedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException, NumberFormatException{
        	
            FileReader reader = new FileReader("non_existent_file.txt");
 
       
    }
}
