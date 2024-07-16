package com.MainApp;

public class InterfaceInJava {

	public static void main(String[] args) {
		
//		Sample s = new Sample();
//		s.show();
		
		Employee e = new Employee(1, "Vitthal");
		e.show();
	}

}

interface Demo{
	public void show();
}

class Sample implements Demo{

	
	public void show() {
		System.out.println("showing");
		
	}
	
}

class Employee implements Demo{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
	}
}
