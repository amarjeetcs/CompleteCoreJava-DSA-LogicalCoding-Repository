package com.Core.Java.JDK8.LamdaAndFunctionalInterface;

@FunctionalInterface
interface inter{
	public void m1();
	//public void m2();
	default void run() {
		getData();
		System.out.println("default methods...");
	}
	
	static void eat()
	{
		System.out.println("static method...");
	}
	
	private  void getData()
	{
		System.out.println("i am private method");
	}
}
public class HelloWord {
	public static void main(String[] args) {

		
		
		inter i=()->System.out.println("Hello World...");
		i.m1();
		i.run();
		inter.eat();
		
	}

}
