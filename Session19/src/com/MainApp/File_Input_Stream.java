package com.MainApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Input_Stream {

	public static void main(String[] args) throws IOException{
		
//		String path = "C:\\Users\\vitth\\Desktop\\data.txt";
//		FileInputStream fis = new FileInputStream(path);
//		
//		int temp = 0;
//		while((temp=fis.read())!= -1) {
//			System.out.print((char)temp);
//		}
		
		String path = "C:\\Users\\vitth\\Desktop\\data.txt";
		FileOutputStream fos = new FileOutputStream(path, true);
		
		String s = " hello world";
//		for(int i=0;i<s.length();i++) {
//			fos.write(s.charAt(i));
//		}
		
		byte[] b=s.getBytes();
		fos.write(b);
		
		
		
		
		
		
		
	}

}
