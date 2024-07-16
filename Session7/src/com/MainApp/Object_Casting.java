package com.MainApp;

public class Object_Casting {

	public static void main(String[] args) {
		//up-casting
//		Parent p = (Parent)new child();
//		p.show();
		
		
		//down-casting
//		child c = new Parent();//it will throw compile time error
		
//		child c = (child) new Parent();  it will throw run time error
		
		Parent p = new child();
		
		child c = (child)p;
		
		c.show();
		c.disp();
		
	}

}


class Parent {
	public void show() {
		System.out.println("showing");
	}
}

class child extends Parent{
	public void disp() {
		System.out.println("displaying");
	}
}