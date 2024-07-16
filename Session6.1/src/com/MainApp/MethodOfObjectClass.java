package com.MainApp;

public class MethodOfObjectClass {

	public static void main(String[] args) {
		
		String s1 = "seed";
		String s2 = "pune";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		
		Abc a = new Abc();
		System.out.println(a.getClass());
	}

}

class Abc{
	
}
