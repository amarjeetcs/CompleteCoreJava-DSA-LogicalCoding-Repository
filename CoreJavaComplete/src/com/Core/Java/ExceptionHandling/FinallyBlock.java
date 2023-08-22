package com.Core.Java.ExceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
	         int a=0,b=30;
	         int c = b/a;
	         System.out.println("code");
	         System.out.println(c);
	      } catch(ArithmeticException ae){
	         System.out.println(ae);
	      } finally {
	         System.out.println("finally block is always executed");
	      }
	}
}
