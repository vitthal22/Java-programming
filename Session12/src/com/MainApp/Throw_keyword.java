package com.MainApp;

public class Throw_keyword {

	public static void main(String[] args) {
		
		try {
			Demo d = new Demo();
			d.div();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

//throw keyword
class Demo{
	public void div() {
		int n1 = 10;
		int n2 = 2;
		
		if(n2==0) {
			throw new ArithmeticException("de should not be zero");
		} else {
			System.out.println("Div: "+(n1/n2));
		}
	}
}