package com.Core.Java.ExceptionHandling.checkedException;

import java.io.FileReader;

public class M {
	/*
	 * public static void main(String[] args) throws Exception{
	 * System.out.println("this is main method"); doSomethig(); }
	 * 
	 * public static void doSomethig() { System.out.println("this is doSomething");
	 * doSomethingMore(); System.out.println("this is doSomething"); }
	 * 
	 * public static void doSomethingMore() {
	 * System.out.println("this is doSomethingMore"); try { System.out.println(10 /
	 * 0); } catch(Exception e) {
	 * System.out.println("exception handled succesfully"); }
	 * System.out.println("this is doSomethingMore"); }
	 */
	
	
	public static void main(String[] args) throws Exception{
		System.out.println("this is main method");
		doSomethig();
	}

	public static void doSomethig() throws Exception{
		System.out.println("this is doSomething");
		doSomethingMore();
		System.out.println("this is doSomething");
	}

	public static void doSomethingMore() throws Exception{
		System.out.println("this is doSomethingMore");
		
		try {
			FileReader reader = new FileReader("non_existent_file.txt");
		}catch(Exception e)
		{
			System.out.println("Exception handled successfylly");
		}
		
		System.out.println("this is doSomethingMore");
	}

}
