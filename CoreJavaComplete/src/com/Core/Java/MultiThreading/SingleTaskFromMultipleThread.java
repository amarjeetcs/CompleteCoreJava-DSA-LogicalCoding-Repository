package com.Core.Java.MultiThreading;
public class SingleTaskFromMultipleThread extends Thread {
public void run()
{
	System.out.println("Running...");
}
	public static void main(String[] args) {
		SingleTaskFromMultipleThread stfmt=new SingleTaskFromMultipleThread();
		stfmt.start();
		
		SingleTaskFromMultipleThread stfmt2=new SingleTaskFromMultipleThread();
		stfmt2.start();
	}

}
