package com.Core.Java.MultiThreading;
public class Yeild extends Thread{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
		
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}

public static void main(String[] args) {
		Yeild y=new Yeild();
		y.start();
		
	
		
		for(int i=1;i<5;i++)
		{
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+"="+i);
		
		}
		
	}

}
