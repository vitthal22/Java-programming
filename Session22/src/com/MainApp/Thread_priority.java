package com.MainApp;

public class Thread_priority extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Thread_priority t1 = new Thread_priority();
		t1.setName("A");
		
//		t1.setPriority(MAX_PRIORITY);
		t1.setPriority(8);
		
		Thread_priority t2 = new Thread_priority();
		t2.setName("B");
		
//		t2.setPriority(MIN_PRIORITY);
		t2.setPriority(3);
		
		t1.start();
		t2.start();
	}

}
