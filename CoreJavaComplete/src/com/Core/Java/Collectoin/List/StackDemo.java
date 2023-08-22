package com.Core.Java.Collectoin.List;
import java.util.*;
public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack<>();
		s.push(1);
		s.push("amarjeet");
		s.push('c');
		s.push(10.3);
		System.out.println("searching: "+s.search(1));
		System.out.println(s);
		
	
		System.out.println("last element deleted: "+s.pop());
		
		System.out.println("top of the stack: "+s.peek());	
		System.out.println(s.isEmpty());
		System.out.println(s.indexOf(1));
		s.add(3);
		System.out.println(s);
		
		
		//it work on the LIFO
		
		
	}

}
