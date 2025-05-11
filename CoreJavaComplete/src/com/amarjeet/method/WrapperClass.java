package com.amarjeet.method;

public class WrapperClass {
	public static void main(String[] args) {
		System.out.println("this is autoboxing");
		int a=10;
		Integer i=a;
		System.out.println(i.getClass());
//		Integer i1=i.valueOf(a);
//		System.out.println(i1.getClass());
		
		System.out.println("below is unboxing");
		Integer i1=new Integer(5);
		System.out.println("this is hashcode"+i1.hashCode());
		System.out.println(i1.getClass());
		int i2=i1;
		System.out.println(i2);
		
		Boolean b=new Boolean(true);
		boolean b2=b;
		System.out.println(b2);
		
		
		//getClass(), equals(),
		
	}

}
