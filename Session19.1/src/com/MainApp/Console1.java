package com.MainApp;

import java.io.Console;
import java.util.Scanner;

public class Console1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter password: ");
//		String name = sc.next();
		
		
		Console c = System.console();
		
		System.out.println("Enter password: ");
		char pass[] = c.readPassword();
		
//		for(char ch:pass) {
//			System.out.println(ch);
//		}
		
		String s = String.valueOf(pass);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
	}

}
