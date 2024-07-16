package com.MainApp;

public class StaticCall_in_Interface {

	public static void main(String[] args) {
		
		Abc.show();
	}

}

interface Abc{
	public static void show () {
		System.out.println("showing in abc");
	}
}
//we can call the static class in class by the class name only.