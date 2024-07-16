package com.MainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Build_a_Stream {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(100);
//		al.add(454);
//		al.add(25);
//		al.add(40);
//		
//		List<Integer> l = al.stream() //build the stream
//		.filter(x-> x<50)
//		.map(x-> x+5)
//		.collect(Collectors.toList());
//		System.out.println(l);
		
		
		Integer arr[] = {10,20,500,30,45,70};
		
		List<Integer> l = Stream.of(arr)
		.filter(x-> x<50)
		.map(x-> x+5)
		.collect(Collectors.toList());
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
	}

}
