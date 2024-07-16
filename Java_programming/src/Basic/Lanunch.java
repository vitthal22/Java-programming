package Basic;

public class Lanunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo md = new MethodDemo();//object creation
		md.abc();
		
		int xf = md.add();
		System.out.println(xf);
		
		System.out.println(md.add());
		
		int s =2;
		int e =3;
		md.sub(s,e);
		
		int result = md.cube(4);
		System.out.println(result);
		
	}

}

class MethodDemo
{
	/*
	 * 1. non parameterized method
	 *     a. non-return type  b. return type
	 * 
	 * 2. parameterized method
	 * 		a. non-return type  b. return type
	 */
	
	
	public void abc()
	{
		System.out.println("non return type");
	}
	
	public int add()
	{
		int n1 =10;
		int n2 =20;
		int res = n1+n2;
		return res;
	}
	
	public void sub(int a, int b)
	{
		int ans = a-b;
		System.out.println(ans);
	}
	
	public int cube(int x)
	{
		int y = x*x*x;
		return y;
		
	}
}


