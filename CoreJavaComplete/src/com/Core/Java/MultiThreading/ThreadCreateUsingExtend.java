package com.Core.Java.MultiThreading;
public class ThreadCreateUsingExtend extends Thread
{
	public void run()
	{
		System.out.println("Running...");
	}
	public static void main(String[] args) {
		ThreadCreateUsingExtend t=new ThreadCreateUsingExtend();
		t.start();
		

	}

}
