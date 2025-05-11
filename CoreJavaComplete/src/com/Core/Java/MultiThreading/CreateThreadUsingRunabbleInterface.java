package com.Core.Java.MultiThreading;
class CreateThreadUsingRunabbleInterface  implements Runnable
{
	public void run()
	{
		System.out.println("Running...");
	}
	public static void main(String[] args) {
		CreateThreadUsingRunabbleInterface t1=new CreateThreadUsingRunabbleInterface();
		Thread t=new Thread(t1);
		t.start();
		
	}

}
