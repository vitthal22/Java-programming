package com.MainApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\vitth\\Desktop\\data.txt";
		FileInputStream fis = new FileInputStream(path);
		
		int temp = 0;
		String s = "";
		while((temp=fis.read())!= -1) {
			s += (char)temp;
		}
		
//		String path1 = "C:\\Users\\vitth\\Desktop\\abc.txt";
		new FileOutputStream("C:\\Users\\vitth\\Desktop\\abc.txt").write(s.getBytes());
		
//		fos.write(s.getBytes());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
