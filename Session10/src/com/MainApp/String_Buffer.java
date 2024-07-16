package com.MainApp;

import java.util.Optional;

public class String_Buffer {

	public static void main(String[] args) {
		
//		StringBuffer s1 = new StringBuffer("seed");
//		s1.append(" pune");
//		System.out.println(s1);
//		
//		//StringBuilder
//		StringBuilder s2 = new StringBuilder("Seed ");
//		s2.append(" infotech");
//		System.out.println(s2);
		
		//null pointer exception
		
		String s[] = new String[5];
		s[1] = "seed";
		
		s[4] = "pune";
		
//		System.out.println(s[0].toUpperCase());
//		System.out.println(s[1].toUpperCase());
		
//		Optional op = Optional.ofNullable(s[1]);
//		
//		if(op.isPresent()) {
//			System.out.println(s[1].toUpperCase());
//		}
//		else {
//			System.out.println("string is null");
//		}
		
		for(int i = 0;i<s.length;i++) {
			Optional op = Optional.ofNullable(s[i]);
			
			if(op.isPresent()) {
				System.out.println(s[i].toUpperCase());
			}
			else {
				System.out.println("string is null");
			}
		}
		
		
	}

}
