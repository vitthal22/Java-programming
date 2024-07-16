package com.MainApp;

import java.util.Vector;

public class Vector_list {

	public static void main(String[] args) {
		
		Vector v = new Vector<>();
		
		v.add(10);
		v.add("vitthal");
		v.add('A');
		v.add(12.22);
		
//		System.out.println(v.get(0));
		
//		v.remove(0);
		
//		v.set(0, "new data");
		
		System.out.println(v.size());
		System.out.println(v.contains(10));
		System.out.println(v);
	}

}
