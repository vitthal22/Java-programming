package com.MainApp;

import java.util.Scanner;

public class launch {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter id: ");
//		int id = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("Enter name: ");
//		String name = sc.nextLine();
//		
//		System.out.println("enter salary: ");
//		double salary = sc.nextDouble();
//		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(salary);
		
		
		
//		System.err.println((10/0));
		
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
