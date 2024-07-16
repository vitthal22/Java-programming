package com.MainApp;

public class Anomymus_inner_class {

	public static void main(String[] args) {
		//anonymous inner class
		Demo1 d1 =  new Demo1() {
			public void temp() {
				
				System.out.println("hello");
			}
		};
		d1.temp();
	}

}

abstract class Demo1{
	public abstract void temp();
}
