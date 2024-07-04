package com.Core.Java.Interface.multiple;

public interface Interface1 {
	void run();
}

interface interface2 {
	void eat();
}

class InterDemo implements Interface1, interface2 {

	@Override
	public void eat() {
		System.out.println("i am eating");

	}

	@Override
	public void run() {
		System.out.println("i am running");
	}

}

class Test {
	public static void main(String[] args) {
		InterDemo d=new InterDemo();
		d.run();
		d.eat();
	}
}
