package com.Core.Java.JDK8.LamdaAndFunctionalInterface;
@FunctionalInterface
interface findLengthDemo{
	public int findLenght(String str);
	
}
public class FindLenght {
	
	public static void main(String[] args) {
		findLengthDemo i=s->s.length();
		System.out.println(i.findLenght("Amarjeet"));
		
	}

}
