package com.Core.Java.MultiThreading;

public class Join extends Thread {
	public void run()
	{
		try
		{
			System.out.println("medical start");
			Thread.sleep(1000);
			System.out.println("mediacal completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
public class TestDrive extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Test Started");
			Thread.sleep(3000);
			System.out.println("Test completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
public class OfficerSign extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Officer Take a file");
			Thread.sleep(1000);
			System.out.println("Officer work completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
}
	public static void main(String[] args) {
		
		Join j=new Join();
		j.start();
		//j.join();
		
		//TestDrive td=new TestDrive();
		//td.start();
		//td.join();
		
		
		
	
		
	}

}
