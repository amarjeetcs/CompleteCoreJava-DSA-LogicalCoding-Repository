package com.Core.Java.Variables;

public class InstanceVariable {
	// instance variable-> creating inside the class and outside the main method
	static String str = "Amarjeet";
	int x = 10;

	public static void main(String[] args) {

		InstanceVariable i = new InstanceVariable();
		System.out.println("this is static:" + i.str);
		InstanceVariable v = new InstanceVariable();
		System.out.println(v.str);
		System.out.println("static:"+str);

		// Float vs float--> Float --wrapper

	}

}
