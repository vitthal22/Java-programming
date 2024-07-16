package com.MainApp;

public class Generic_class {

	public static void main(String[] args) {
		
		MyGenericClass mgc = new MyGenericClass();
		mgc.setA("hello");
		System.out.println(mgc.getA());
	}

}
//before java5 ----> no type safe(required explicit type casting)
class MyGenericClass{
	Object a;

	public Object getA() {
		return a;
	}

	public void setA(Object a) {
		this.a = a;
	}
	
}