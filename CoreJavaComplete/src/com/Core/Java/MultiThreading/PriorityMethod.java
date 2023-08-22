package com.Core.Java.MultiThreading;
public class PriorityMethod extends Thread {
	public void run()
	{
		System.out.println("child Thread"+Thread.currentThread().getPriority());
		System.out.println("child Thread priority:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		System.out.println("main Thread old priority:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("main Thread new priority:"+Thread.currentThread().getPriority());
		
		PriorityMethod pm=new PriorityMethod();
		pm.start();
	
		
	}

}
