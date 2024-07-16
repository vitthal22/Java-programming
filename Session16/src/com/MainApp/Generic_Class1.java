package com.MainApp;

public class Generic_Class1 {

	public static void main(String[] args) {
		
		MyGenericClass1<String> ob1 = new MyGenericClass1<>();
		ob1.setA("vitthal");
//		System.out.println(ob1.getA());
		String s=ob1.getA();
	}

}
//After java 5 -----> type safe(no req explicit type casting)
class MyGenericClass1<T>{
	T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
}