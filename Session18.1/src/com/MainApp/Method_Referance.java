package com.MainApp;

import java.util.concurrent.Semaphore;

public class Method_Referance {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
//		Demo d = s::doWork;
//		d.temp();
		
		Demo d = Sample::show;
		d.temp();
	}

}

interface Demo{
	void temp();
}

class Sample{
	public void doWork() {
		System.out.println("doing Work");
	}
	public static void show() {
		System.out.println("showing");
	}
}