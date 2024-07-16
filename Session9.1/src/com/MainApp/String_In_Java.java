package com.MainApp;

public class String_In_Java {

	public static void main(String[] args) {
		//String in java
		//ctrl+shift+t to search class
		String s1 = "seed";
		String s2  = "seed";
		String s3 = new String("seed");
		
		// on the basis data ----> equals()
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
		
		//on the basis of memory location-----> "=="
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
	}

}
