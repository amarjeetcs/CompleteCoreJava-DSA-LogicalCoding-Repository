package com.java.logical.coding.Array;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class FindDuplicate {
	static Logger logger = Logger.getLogger(FindDuplicate.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("src/com/amarjeet/JavaLogicalCoding/PropertiesFile/application.priperties");
		logger.debug("main method called");
		int[] arr = { 1, 1, 22, 23, 43, 43, 34, 32 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate element is:" + arr[j]);
				}
			}
		}
	}
}
