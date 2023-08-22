package com.Core.Java.MultiThreading;
public class MultipleTaskMultipleThread extends Thread
{
	public void run()
	{
		System.out.println("Running Thread1...");
	}
}

class MultipleTaskMultipleThread2 extends Thread
{
	public void run()
	{
		System.out.println("Running Thread2...");
	}
}

class Main
{
	public static void main(String[] args) {
		MultipleTaskMultipleThread t1=new MultipleTaskMultipleThread();
		t1.start();
		
		MultipleTaskMultipleThread2 t2=new MultipleTaskMultipleThread2();
		t2.start();
	}
}
