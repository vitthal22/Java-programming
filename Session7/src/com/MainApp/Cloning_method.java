package com.MainApp;

public class Cloning_method {

	public static void main(String[] args) {
		//Shallow clone
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("vitthal");
		
		Employee e1 = e;
		
		e.setName("xyz");
		System.out.println(e1.getName());

	}

}

class Employee{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}