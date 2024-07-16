package com.MainApp;

public class Anonymous_inner_interface {

	public static void main(String[] args) {
		// anonymous inner interface
		Demo2 d2 = new Demo2() {
			public void temp() {

				System.out.println("hello");
			}
		};
		d2.temp();

	}

}

abstract class Demo2 {
	public abstract void temp();
}





@FunctionalInterface
interface Seed{
	public void show();
	
	public static void doWork() {
		
	}
}

/*
 * ActionListner
 * runnable
 * comparator
 * comparable
 */