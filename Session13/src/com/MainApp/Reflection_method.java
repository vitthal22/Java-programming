package com.MainApp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection_method {

	public static void main(String[] args) throws Exception{
		
		Class c = Class.forName("com.MainApp.Sample");
		
//		Field arr[] = c.getFields();
//		Field arr[] = c.getDeclaredFields();
//		
//		for (Field f : arr) {
//			System.out.println(f);
//		}
		
		
		
//		Method arr[] = c.getMethods();
//		Method arr[] = c.getDeclaredMethods();
//		
//		for (Method method : arr) {
//			System.out.println(method);
//		}
		
		
//		Constructor arr[] = c.getConstructors();
		Constructor arr[] = c.getDeclaredConstructors();
		
		for (Constructor constructor : arr) {
			System.out.println(constructor);
		}
	}

}

class Sample{
	public int a;
	protected String name;
	private int age;
	
	public String city;
	
	public void show() {
		
	}
	
	private int pqr(int a) {
		return a;
		
	}
	
	protected void name() {
		
	}
	
	public Sample(float f) {
		
	}
	
	private Sample(int a) {
		
	}
	
	protected Sample(String n) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
