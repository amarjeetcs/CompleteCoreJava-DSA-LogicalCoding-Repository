package com.Core.Java.ExceptionHandling;

import java.io.IOException;

public class TryCatchFinally {
	public static void main(String[] args) {

		try {
			System.out.println("this is before exception");
			System.out.println("this is before exception");
//			System.exit(1);
			int a = 10 / 0;
			System.out.println("this is after exception");
			System.out.println("this is after exception");
			System.out.println("this is after exception");
			System.out.println("this is after exception");
			System.out.println("this is after exception");
			System.out.println("this is after exception");
			System.out.println("this is after exception");
			
						
		} 

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println("this is exception exception"+e.getMessage());
			//System.out.println(e);
			//System.out.println("this is catch");
		}catch(Exception e)
		{
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e);
			System.out.println("this exception");
		}

		finally {
			System.out.println("this will always exceute");
			
		}
		
		

	}
}
