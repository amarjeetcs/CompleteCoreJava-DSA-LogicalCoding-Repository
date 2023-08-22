package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;
import java.util.Arrays;

public class ToArrayUses {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Object[] arr=list.stream().toArray();
		for(Object i:arr)
		{
			System.out.println(i);
		}
	}
}
