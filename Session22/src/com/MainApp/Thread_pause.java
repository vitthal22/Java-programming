package com.MainApp;

public class Thread_pause {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		
		d1.start();
		d1.yield();
		d2.start();
	}

}

class Demo1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Demo2 extends Thread{
	@Override
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}