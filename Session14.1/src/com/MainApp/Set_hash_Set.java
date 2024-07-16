package com.MainApp;

import java.util.HashSet;

public class Set_hash_Set {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>();
		
		hs.add(10);
		hs.add("vitthal");
		hs.add(30);
		hs.add(10);
		
		System.out.println(hs);
		
		hs.remove(10);
		
		for (Object object : hs) {
			System.out.println(object);
		}
		
		System.out.println(hs.contains(30));
		
	}

}
