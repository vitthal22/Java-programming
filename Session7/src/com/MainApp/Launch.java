package com.MainApp;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter pin ");
		int pin = sc.nextInt();
		System.out.println("enter state ");
		String state = sc.next();
		
		Address add = new Address(pin, state);
		
		System.out.println(add);
	}

}


class Address{
	int pin;
	String State;
	public Address(int pin, String state) {
		super();
		this.pin = pin;
		State = state;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", State=" + State + "]";
	}
	
	
}