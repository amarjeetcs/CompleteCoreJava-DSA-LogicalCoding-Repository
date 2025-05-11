package com.amarjeet.method;

public class TypeCasting {
	public static void main(String[] args) {
		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		System.out.println(d);
		
		System.out.println("below is manual casting");
		double d1=10.89;
		float f1=(float) d1 ;
		System.out.println(f1);
		long l1=(long)f1;
		System.out.println(l1);
	
		
	}

}
