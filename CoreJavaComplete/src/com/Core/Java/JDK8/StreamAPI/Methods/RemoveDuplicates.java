package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.Arrays;

public class RemoveDuplicates {
public static void main(String[] args) {
	int[] arr= {1,3,4,6,7,5,2,2,4,7};
	Arrays.stream(arr).distinct().sorted().forEach(e->System.out.println(e));
}
}
