package com.Core.Java.OPPS.Inheritence;

public class Singlelevel {
	void run() {
		System.out.println("i am running with dad...");
	}
}

class Ram extends Singlelevel {
	void eat() {
		System.out.println("i am eating...");
	}
}

class Test {
	public static void main(String[] args) {
		Ram d = new Ram();
		d.run();
		d.eat();
	}
}
