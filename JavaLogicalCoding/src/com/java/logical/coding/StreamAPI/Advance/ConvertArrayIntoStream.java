package com.java.logical.coding.StreamAPI.Advance;

import java.util.stream.Stream;

public class ConvertArrayIntoStream {
	public static void main(String[] args) {
		String[] str= {"amarjeet","rajnish","hira","nikki"};
		Stream<String> stream=Stream.of(str);
		stream.forEach(e->System.out.println(e));
	}

}
