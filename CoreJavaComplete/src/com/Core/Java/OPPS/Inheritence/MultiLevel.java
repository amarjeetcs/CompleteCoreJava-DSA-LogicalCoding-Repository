package com.Core.Java.OPPS.Inheritence;
public class MultiLevel {
	void eat()
	{
		System.out.println("i am eating with Bhaiya...");
	}
}

class Dog extends MultiLevel
{
	void run()
	{
		System.out.println("i am running with my dog...");
	}
}
class Cat extends Dog
{
	void bark()
	{
		System.out.println("i am barking with my cat...");
	}
}
class Area
{
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.run();
		c.bark();
	}
}
