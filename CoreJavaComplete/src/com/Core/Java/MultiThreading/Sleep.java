package com.Core.Java.MultiThreading;
/*

public class Sleep {

	public static void main(String[] args) throws Exception {
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
	}

}
*/
/*
public class Sleep
{
	public static void main(String[] args) {
			try
			{
				for(int i=1;i<=10;i++)
				{
					Thread.sleep(1000);
					System.out.println(i);
				}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

*/
public class Sleep extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);//sleep is a static method in Multithreading
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Sleep s=new Sleep();
		s.start();
	}
}