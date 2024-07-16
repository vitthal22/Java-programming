package com.MainApp;
import com.Temp.Demo;
public class Launch {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.show();
//		d.disp()
		Sample s = new Sample();
	}
}

class Sample extends Demo{
	public Sample(){
		super.disp();
	}
}