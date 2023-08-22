package com.Core.Java.MultiThreading;
//Daemon Thread which is running in a background of a program
//it is provide service for the Thread is a program.
public class DaemonMethod extends Thread{
	public void run()
	{	System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Running Deamon Threads..."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("Running main Threads..."+Thread.currentThread().getName());
		DaemonMethod dm=new DaemonMethod();
		//dm.setDaemon(true);
		dm.start();
		

	}

}
