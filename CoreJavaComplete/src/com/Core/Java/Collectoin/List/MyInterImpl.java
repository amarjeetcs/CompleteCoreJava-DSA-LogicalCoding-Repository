package com.Core.Java.Collectoin.List;

public class MyInterImpl implements MyInter{

	@Override
	public void run() {
		System.out.println("running...");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping...");
		
	}
	
	public static void main(String[] args) {
		MyInter m=new MyInterImpl();
		m.run();
		m.sleep();
	}

}
