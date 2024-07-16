package com.Main.App;

//import static com.Main.App.Demo.doWork;
//import static com.Main.App.Demo.a;

import static com.Main.App.Demo.*;



public class ImortStaticMethd {

	public static void main(String[] args) {
		
		doWork();
		doWork();
		
		System.out.println(a);
	}

}

class Demo{
	static int a = 10;
	public static void doWork() {
		System.out.println("doing Work");
	}
}