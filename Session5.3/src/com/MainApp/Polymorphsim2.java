package com.MainApp;

public class Polymorphsim2 {

	public static void main(String[] args) {
		
		Parent b = new Child();
		b.show();
		
		Parent c = new Parent();
		c.show();
	}

}

class Parent {
	public void show() {
		System.out.println("showing in A class ");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("showing in B class ");
	}
}