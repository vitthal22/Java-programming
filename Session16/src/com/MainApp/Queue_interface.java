package com.MainApp;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_interface {

	public static void main(String[] args) {
		//queue ----> 1. LinkedList  2. priority queue
		
//		Queue q = new LinkedList<>();
		
//		q.offer(10);//add
//		q.offer(25);
//		q.offer(35);
//		q.offer(45);
		
//		System.out.println(q);
//		System.out.println(q.peek());//get
		
//		q.poll(); // remove
		
//		System.out.println(q);
		
		
		
		// priority queue
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(65);
		pq.offer(45);
		pq.offer(10);
		pq.offer(15);
		
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq.peek());
		
		
		
		
	}

}
