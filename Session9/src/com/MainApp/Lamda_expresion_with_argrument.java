package com.MainApp;

public class Lamda_expresion_with_argrument {

	public static void main(String[] args) {

		seed s1 = (msg) -> System.out.println(msg);

		s1.say("hello");

		Arthmatic a = ( x,  y) -> {
			int ans = y;
			return ans;
		};
		System.out.println(a.add("ase", 20));
	}

}

interface seed {
	void say(String msg);
}

interface Arthmatic {
	int add(String a, int b);
}