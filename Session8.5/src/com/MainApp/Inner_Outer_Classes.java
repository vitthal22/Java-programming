package com.MainApp;

public class Inner_Outer_Classes {

	public static void main(String[] args) {
		
		outer o = new outer();
//		o.disp();
//		System.out.println(o.a);
		
		outer.inner i = o.new inner();
		i.show();
	}

}

class outer {
	int a = 10;
	private String name = "abc";
	
	class inner{
		public void show() {
			System.out.println(name);
		}
	}
	
	public void disp() {
		System.out.println("displaying");
	}
}