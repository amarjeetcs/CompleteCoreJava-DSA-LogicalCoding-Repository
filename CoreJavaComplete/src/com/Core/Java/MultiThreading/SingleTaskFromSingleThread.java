package com.Core.Java.MultiThreading;
public class SingleTaskFromSingleThread extends Thread
{
public void run()
{
	System.out.println("Running...");
}
	public static void main(String[] args) {
		SingleTaskFromSingleThread stfst=new SingleTaskFromSingleThread();
		stfst.start();
		
	}

}
