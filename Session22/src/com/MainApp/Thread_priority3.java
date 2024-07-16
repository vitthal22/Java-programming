package com.MainApp;

public class Thread_priority3 extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread_priority3 t1 = new Thread_priority3();
		t1.setName("A");
		
		Thread_priority3 t2 = new Thread_priority3();
		t2.setName("B");
		
		t1.start();
		t1.join();
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		
		
		
	}

}
