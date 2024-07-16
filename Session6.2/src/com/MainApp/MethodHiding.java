package com.MainApp;

public class MethodHiding {

	public static void main(String[] args) {
		Vehicle b = new Bike();
		b.start();

	}

}

abstract class Vehicle{
	public abstract void start();
}
class Bike extends Vehicle{
	public void start() {
		System.out.println("by kick");
		
	}
}
