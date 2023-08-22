package com.Core.Java.JDK8.LamdaAndFunctionalInterface;

public interface inter1 {
	static int x = 10;
	final int y = 20;

	abstract void eat();
	public void run();
	default void default_bark()
	{
		System.out.println("I am default method...");
	}
	
	static void static_bark()
	{
		System.out.println("I am static method...");
	}

}
class Amarjeet implements inter1{

	@Override
	public void eat() {
		System.out.println("I am eating...");
		
	}

	@Override
	public void run() {
		System.out.println("I am running...");
		
	}
	public static void main(String[] args) {
		Amarjeet am=new Amarjeet();
		am.eat();
		am.run();
		am.default_bark();
		System.out.println(am.y);
		System.out.println(inter1.x);
		
	}
	
}
