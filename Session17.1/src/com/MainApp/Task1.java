package com.MainApp;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(100);
		al.add(454);
		al.add(25);
		al.add(40);
		
		
//		for(int i = 0; i<al.size();i++) {
//			if(al.get(i)<50) {
//				Integer a = al.get(i) + 5;
//				al1.add(a);
//			}
//			System.out.println(al1);
//		}
		for (Integer integer : al) {
			if(integer<50) {
				al1.add(integer+5);
			}
		}
		System.out.println(al1);
		
	}

}
