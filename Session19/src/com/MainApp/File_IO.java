package com.MainApp;

import java.io.File;
import java.io.IOException;

public class File_IO {

	public static void main(String[] args) throws IOException{
		
		String path = "C:\\Users\\vitth\\Desktop\\data.txt";
		File f = new File(path);
		
//		System.out.println(f.canRead());
		
//		System.out.println(f.isAbsolute());
		
//		System.out.println(f.length());
		
//		System.out.println(f.exists());
		
//		f.delete();
		
//		f.createNewFile();
		
		String path1 = "C:\\Users\\vitth\\Desktop\\acc";
		File f1 = new File(path1);
		
		f1.mkdir();
		f1.mkdirs();
		
		
		
		
	}

}
