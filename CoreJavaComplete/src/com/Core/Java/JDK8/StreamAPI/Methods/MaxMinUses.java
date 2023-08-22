package com.Core.Java.JDK8.StreamAPI.Methods;

import java.util.*;

public class MaxMinUses {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,5,2,1);
		Optional <Integer> maxElement=list.stream().max((v1,v2)->{return v1.compareTo(v2);});
		System.out.println("Max is: "+maxElement.get());
		
		Optional<Integer> minElement=list.stream().min((v1,v2)->{return v1.compareTo(v2);});
		System.out.println("Min is: "+minElement.get());
	}

}
