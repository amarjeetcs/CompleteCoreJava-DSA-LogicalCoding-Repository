package com.Core.Java.TypeCasting;
public class TypeCasting {
    public static void main(String[] args) {
	
    	
    	//byte -> short -> char -> int -> long -> float -> double  
    	/*boolean bool = true;
    	byte b1 = (byte) (bool ? 1 : 0);
    	System.out.println("boolean to byte: " + b1);
    	
    	byte b=65;
    	short s=b;
    	System.out.println("byte to short: "+s);
    	
    	char c=(char)s;
    	System.out.println("short to char: "+c);
    	
    	int i=(int)c;
    	System.out.println("char to int: "+i);
    	
    	long l=i;
    	System.out.println("int to long: "+l);
    	
    	float f=l;
    	System.out.println("long to float: "+f);
    	
    	double d=f;
    	System.out.println("float to double: "+d);
    	*/
    	//double->float->long->int->char->short->byte->boolean
    	
    	double d=65;
    	float f=(float)d;
    	System.out.println("double to float: "+f);
    	
    	long l=(long)f;
    	System.out.println("float to long: "+l);
    	
    	int i=(int)l;
    	System.out.println("Long to int: "+i);
    	
    	char c=(char)i;
    	System.out.println("int to char: "+c);
    	
    	short s=(short)c;
    	System.out.println("char to short: "+s);
    	
    	byte b=(byte)s;
    	System.out.println("short to byteL: "+b);
    	
    	byte b1 = 1;
    	boolean bool = (b1 != 0);
    	System.out.println("byte to boolean: " + bool);
    	
    	
    	
    	
    	
    	
}
}

