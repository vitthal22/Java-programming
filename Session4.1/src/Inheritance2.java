
public class Inheritance2 {

	public static void main(String[] args) {
		
		//Multiple level inheritance
		Son s = new Son();
		System.out.println(s.sname+" "+s.fname+" "+s.surname);
		System.out.println(s.land);
		System.out.println(s.bal);
	}

}


class GrandFather
{
	String name = "Ram";
	String surname = "Gupta";
	int bal = 10000;
}

class Father extends GrandFather
{
	String fname  = "Anju";
	String land = "10acre";
}

class Son extends Father
{
	String sname = "Rohit";
}