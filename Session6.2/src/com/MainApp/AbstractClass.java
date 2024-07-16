package com.MainApp;

public class AbstractClass {

	public static void main(String[] args) {
		//non-abstract method to access
//		Temp t = new Temp();
//		t.show();
		
		//abstract class to access
		Temp t = new Temp();
		t.doWork();

	}

}

//abstract class Demo{
//	//non-Abstract Method
//	public void show() {
//		System.out.println("showing");
//	}
//}
//
//class Temp extends Demo{
//	
//}

abstract class Demo{
	//abstract method
	public abstract void doWork();
}
class Temp extends Demo{
	public void doWork() {
		System.out.println("doing work");
	}
}