package com.Core.Java.ExceptionHandling;

public class Throwskeyword {
	public static void validateAge(int age) throws Exception  {
		if(age<20)
		{
			throw new Exception("Persion is not eligiable for vote");
		}
		else
		{
			System.out.println("Persion is eligiable for vote");
		}
	}
	public static void main(String[] args) throws Exception{
		try {
			validateAge(19);
		}catch(Exception e)
		{
			System.out.println("exception handler");
		}
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
