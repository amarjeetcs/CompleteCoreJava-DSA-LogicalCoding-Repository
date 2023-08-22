package com.Core.Java.JDK8.StreamAPI.Array.Coding;
import java.util.*;

public class FindMin {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,32,5,1);
		Optional<Integer> ls=list.stream().min((v1,v2)->{return v1.compareTo(v2);});
		System.out.println(ls.get());
	}

}
