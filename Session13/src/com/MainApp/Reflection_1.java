package com.MainApp;

public class Reflection_1 {

	public static void main(String[] args) throws Exception{
		
//		Demo d = new Demo();
//		Class c = d.getClass();
//		System.out.println(c);
		
		Class c = Class.forName("com.MainApp.Demo");
		Demo d = (Demo)c.newInstance();
		d.doWork();
	}

}

class Demo{
	public void doWork() {
		System.out.println("doing work");
	}
}