package com.MainApp;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Map_Interface {

	public static void main(String[] args) {
		//HashMap
		
//		HashMap<Integer, String> hm = new HashMap<>();
		
//		hm.put(101, "java");
//		hm.put(102, "python");
//		hm.put(103, "spring");
//		hm.put(101, "rust");
		
//		System.out.println(hm);
//		System.out.println(hm.get(101));
		
//		Iterator<Integer> itr = hm.keySet().iterator();
//		Iterator<String> itr2 = hm.values().iterator();
		
//		while (itr.hasNext()) {	
////			System.out.println(itr.next());
//			Integer key = itr.next();
//			System.out.println(key+":"+hm.get(key));
//		}
		
//		hm.remove(101);
//		System.out.println(hm);
		
		
		
		//HashTable
		
		Hashtable<String, Character> ht = new Hashtable<String, Character>();
		
		ht.put("vitthal", 'V');
		ht.put("Sonal", 'S');
		ht.put("Ram", 'R');
		ht.put("gupta", 'G');
		
		System.out.println(ht);
		
		
	}

}
