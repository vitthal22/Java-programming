package com.MainApp;

public class Thread_priority2 extends Thread {
	
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("My Thread");
	}

	public static void main(String[] args) {
		
		Thread_priority2 t1 = new Thread_priority2();
		t1.interrupt();
		
		System.out.println(t1.isInterrupted());
		
		t1.start();
		
		
		
		
		
	}

}
