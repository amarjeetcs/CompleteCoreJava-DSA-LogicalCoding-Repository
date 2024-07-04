package com.java.logical.coding.sorting;

public class Singleton{
	
	private static Singleton INSTANCE=null;

	private Singleton()
	{
		System.out.println("i am singleton constructor");
	}

	
	public static synchronized Singleton getInstance()
	{
		if(INSTANCE==null)
			INSTANCE=new Singleton();// single object created
		return INSTANCE;// returning the object which is created
	}
	
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
	
}