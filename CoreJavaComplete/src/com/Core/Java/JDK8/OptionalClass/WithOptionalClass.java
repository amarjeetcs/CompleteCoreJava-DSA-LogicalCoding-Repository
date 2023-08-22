package com.Core.Java.JDK8.OptionalClass;

import java.util.Optional;
import java.util.stream.Collectors;

public class WithOptionalClass {
	public static void main(String[] args) {
		String str1=null;
		String str2="amarjeet";
		
		Optional<String> optional1= Optional.ofNullable(str1);
		System.out.println(optional1.isPresent());//value is not there so printed false
		System.out.println(optional1.orElse("value is not present only null is there"));
		
		Optional<String> optional2=Optional.ofNullable(str2);
		System.out.println(optional2.isPresent());//value is present so printed true.
		System.out.println(optional2.get());//get value present
		
		
		//methods name
		//1.ofNullable()
		//2.orElse()
		//3.isPresent()
		//4.get()
		
	}

}
