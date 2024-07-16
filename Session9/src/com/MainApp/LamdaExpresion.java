package com.MainApp;

public class LamdaExpresion {

	public static void main(String[] args) {
		
		Sample s = ()-> {System.out.println("hello");};
		Sample s1 = () -> {System.out.println("say hello");};
		s.doWork();
		s1.doWork();
	}

}
@FunctionalInterface
interface Sample{
	void doWork();
}