package com.Core.Java.ExceptionHandling;

public class NumberFormatExceptionDemo {
	public static void main(String[] args) {
		/*String str="amarjeet";
		int i= Integer.parseInt(str);  //it will print number format exception
		System.out.println(i);*/
		
		try {
			String str="amarjeet";
			int i= Integer.parseInt(str);
			System.out.println(i);
		}catch (Exception e) {
			System.out.println("you can not conver from str to int directly");
		}
	}
	

}
