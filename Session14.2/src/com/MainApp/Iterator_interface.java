package com.MainApp;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

		al.add("10");
		al.add("aaa");
		al.add("30");
		al.add("40");

		Iterator<String> itr = al.iterator();

//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		while (itr.hasNext()) {
			if (itr.next().equals("aaa")) {
				itr.remove();
			}
		}

		System.out.println(al);
	}

}
