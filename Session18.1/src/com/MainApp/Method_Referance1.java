package com.MainApp;

public class Method_Referance1 {

	public static void main(String[] args) {
		
		Demo2 d = Abc::new;
		d.get();
	}

}

interface Demo2{
	Abc get();
}

class Abc{
	Abc(){
		System.out.println("abc constructor");
	}
}
