package com.Core.Java.JDK8.OptionalClass;

import java.util.Optional;

public class WithoutOptionalClass {
	public static void main(String[] args) {
		//without Optional class we are manually checking null checks in out program
		//but java 8 giving to Handle null pointer exception in our program is called 
		//optional class.
		
		String str=null;
		if(str==null)
		{
			System.out.println("value is null");
		}
		else {
			System.out.println(str.length());
		}
	}

}
