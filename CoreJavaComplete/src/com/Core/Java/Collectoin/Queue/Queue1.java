package com.Core.Java.Collectoin.Queue;

import java.util.PriorityQueue;

public class Queue1 {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue<>();
//		p.add('A');
//		p.add('B');
//		p.add('C');
//		p.add('C');
		
		//insertino order is preserved and duplicates are allowed and null insertion is not possible
		System.out.println(p);//[]
		//System.out.println(p.element());//exception
		//System.out.println(p.peek());//null
		
		//System.out.println(p.remove());//exception
		//System.out.println(p.poll());//null
	}

}
