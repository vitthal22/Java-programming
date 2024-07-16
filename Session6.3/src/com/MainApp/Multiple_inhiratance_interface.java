package com.MainApp;

public class Multiple_inhiratance_interface {

	public static void main(String[] args) {
		
		temp t = new temp();
		t.disp();
		t.show();
		
		Demo1.doWork();
	}

}

//we can provide body to interface using default and static

interface Demo1{
	public default void show() {
		System.out.println("showing");
	}
	public static void doWork() {
		System.out.println("doing work");
	}
}

interface Demo2{
	public default void disp() {
		System.out.println("displaying");
	}
}

class temp implements Demo1, Demo2{

	
//	public void disp() {
//		
//		System.out.println("displaying");
//	}
//
//	
//	public void show() {
//		
//		System.out.println("showing1");
//	}
	
	
}