package com.MainApp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Final_Opertation {

	public static void main(String[] args) {
		
		//collect
//		Integer arr2[] = {10,20,500,30,45,70,10,20,45};
//		List<Integer> l2 = Stream.of(arr2)
//		.limit(5)
//		.map(x-> x+5)
//		.collect(Collectors.toList());
//		System.out.println(l2);
		
		
		//for each
//		Integer arr2[] = {10,20,500,30,45,70,10,20,45};
//		Stream.of(arr2)
//		.distinct()
//		.map(x-> x+5)
//		.forEach(x-> System.out.println(x));
		
		
//		Integer arr2[] = {10,20,500,30,45,70,10,20,45};
//		long count = Stream.of(arr2)
//		.distinct()
//		.map(x-> x+5)
//		.count();
//		System.out.println(count);
		
		
		//stream types
		//parallel stream
//		Integer arr2[] = {10,20,500,30,45,70,10,20,45};
//		Stream.of(arr2).parallel()
//		.distinct()
//		.forEach(x-> System.out.println(x));
		
		//parallel stream but output in sequence
		
		Integer arr2[] = {10,20,500,30,45,70,10,20,45};
		Stream.of(arr2).parallel()
		.distinct()
		.forEachOrdered(x-> System.out.println(x));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
