package com.MainApp;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList<>();
		
		ll.add(10);
		ll.add("seed");
		ll.add('A');
		
		
//		ll.addFirst(100);
//		ll.remove(0);
//		ll.removeFirst();
//		ll.removeLast();
		System.out.println(ll);
		
		//Same function as arraylist
		
		ll.set(1, "vitthal");
		System.out.println(ll);
	}

}
