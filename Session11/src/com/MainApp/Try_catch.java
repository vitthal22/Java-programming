package com.MainApp;

import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("first line");
		
		int n1,n2;
		
		try {
			System.out.println("enter first number ");
			n1 = sc.nextInt();
			
			System.out.println("enter second number ");
			n2 = sc.nextInt();
			
			System.out.println("div: "+(n1/n2));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("last line");
		
	}

}
