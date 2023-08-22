package com.Core.Java.JDK8.StreamAPI.CollectionMap.Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		List<Integer> ls=List.of(1,2,3,4,5);
		Map<Integer,String> m=Map.of(1,"amarjeet",2,"sanjeet",3,"ravi",4,"tulsi",5,"sonali");
		System.out.println(m);
		
		List<Integer> ls1=Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(ls1);
		System.out.println(ls);
	}

}
