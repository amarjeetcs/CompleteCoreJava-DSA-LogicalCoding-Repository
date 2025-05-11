package com.amarjeet.file.handling;

import java.io.PrintWriter;
import java.io.IOException;

public class WritingIntoFileUsingPrintWritter {
	public static void main(String[] args) throws Exception {
		PrintWriter writer = new PrintWriter("C:\\Users\\Pc\\Desktop\\IO\\amarjeetSingh.txt");
		{
			writer.println("Hello, PrintWriter allows formatted text output.");
			writer.printf("You can use printf for formatted numbers: %d, %.2f%n", 42, 3.14159);
			System.out.println("Data written to the file successfully.");
			writer.close();

		}
	}
}
