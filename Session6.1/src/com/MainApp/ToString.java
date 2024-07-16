package com.MainApp;

public class ToString {

	public static void main(String[] args) {
		
		demo d = new demo(); 
		d.setA(10);
		
		System.out.println(d);
	}

}

class demo{
	int a;

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "demo [a=" + a + "]";
	}
	
	
}
