package com.MainApp;

public class MultingThreading2 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Sample1());
		t1.setName("abc");
		Thread t2 = new Thread(new Sample2());
		t2.setName("pqr");
		
		t1.start();
		t2.start();
	}

}

class Sample1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}
}

class Sample2 implements Runnable {
	@Override
	public void run() {
		for (int i = 11; i <= 15; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name+i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}
}