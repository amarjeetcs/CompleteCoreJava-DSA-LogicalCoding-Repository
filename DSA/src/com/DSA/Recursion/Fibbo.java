package com.DSA.Recursion;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Fibbo {
	static Logger logger=Logger.getLogger(Fibbo.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("src/com/amarjeet/DSA/PropertiesFile/application.priperties");
		logger.debug("main method executed");
		System.out.println(fib(4));
	}
	
	static int fib(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

}
