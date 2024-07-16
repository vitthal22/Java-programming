package com.MainApp;

public class Task {

	public static void main(String[] args) {
		
		Cube c = (a) -> System.out.println(a*a*a);
		c.dispCube(3);
		
		FindMax f = (s)-> {
			return s.length();
		};
		
		System.out.println(f.length("vitthal"));
		
		Maxnumber m = (i, j) -> {
			if(i>j) {
				return i;
			}
			else {
				return j;
			}
		};
		
		System.out.println("Max no. is "+m.findMax(23, 54));
	}

}

interface Cube{
	void dispCube(int a);
}

interface FindMax{
	int length(String s);
}

interface Maxnumber{
	int findMax(int i, int j);
}
