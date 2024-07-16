package com.MainApp;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
//		TreeSet ts = new TreeSet<>();
//		
//		ts.add(10);
//		ts.add(20);
//		ts.add(10);
//		ts.add(30);
//		System.out.println(ts);
//		for (Object object : ts) {
//			System.out.println(object);
//		}
		
		
		//Navigable Set
		NavigableSet ns = new TreeSet<>();
		ns.add(10);
		ns.add(55);
		ns.add(5);
		ns.add(10);
		
		System.out.println(ns);
		System.out.println(ns.descendingSet());
		
		System.out.println();
	}
}
