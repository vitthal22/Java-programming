package com.MainApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws_Exception_keyword {

	public static void main(String[] args) {
		
		try {
			Demo1 d = new Demo1();
			d.doWork();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		catch (NullPointerException e) {
			System.out.println("String is null");
		}
		catch (Exception e) {
			System.out.println("error occured");
		}
	}

}

class Demo1{
	public void doWork() throws Exception {
		FileInputStream fos = new FileInputStream("abc.txt");
		
		String s = null;
		s.toLowerCase();
	}
}