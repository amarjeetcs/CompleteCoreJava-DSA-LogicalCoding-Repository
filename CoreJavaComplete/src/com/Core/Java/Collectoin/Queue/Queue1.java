package com.Core.Java.Collectoin.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue1 {
	public static void main(String[] args) {
		
		PriorityBlockingQueue   a=new PriorityBlockingQueue ();
		//LinkedBlockingQueue 
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(2);
		
		
		
		
		
		System.out.println(a);
		//		try {
//			a.add(1);
//			a.add(2);
//			a.add(3);
//		}
//		catch(Exception e){
//			System.out.println("queue capacity is full: "+e.getMessage());
//		}
		//System.out.println(a);//u will get exception
//		boolean result =a.offer(3);
//		System.out.println(result);//u will get false if queue is full
		
//		PriorityQueue p=new PriorityQueue<>(5);
//		p.add('A');
//		p.add('B');
//		p.add('B');
//		p.add('B');
//		p.add('C');
//		p.add('C');   
//		p.offer('d');
//
//		System.out.println(p);
		//System.out.println(p.peek());//it is empty so it will return null only, used to featch head of queue
		
		//System.out.println(p.element()); //it is empty so it will throw so suchElementException, used to featch queue and iterate in enumuration
		//System.out.println(p.add(100));
		//System.out.println(p);
//		System.out.println(p.peek());
//		System.out.println(p);
//		
//		System.out.println(p.element());
//		System.out.println(p);
//		
//		System.out.println("pooling: "+p.poll());//return the element and delete from queue and if empty return null
//		System.out.println(p);
//		
//		p.clear();
//		System.out.println(p.poll());  //if empty return nulll
		
		//System.out.println("removing: "+p.remove());//if empty exception
		//System.out.println(p);
		
		
		//insertion order is preserved and duplicates are allowed and null insertion is not possible
		
		//System.out.println(p.element());// used to get the element, if empty throw exception
		//System.out.println(p.peek());//used to get the element, if empty return null
		
		//System.out.println(p.remove());//It is used to retrieves and removes the head of this queue, if empty throw exception
		//System.out.println(p.poll());//It is used to retrieves and removes the head of this queue, if empty return null
		
		
	}

}
