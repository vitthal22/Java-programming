
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arthmetic a = new Arthmetic();
		a.multiply(2, 4);
		a.multiply(34, 345, 44);
		a.multiply(34.45f, 343);
		a.multiply(12, 56.4f);
	}

}

class Arthmetic
{
	public void multiply(int a, int b)
	{
		System.out.println("Multiply: "+(a*b));
	}
	
	public void multiply(int a, int b, int c)
	{
		System.out.println("Multiply: "+(a*b*c));
	}
	
	public void multiply(int a, float b)
	{
		System.out.println("Multiply: "+(a*b));
	}
	
	public void multiply(float a, int b)
	{
		System.out.println("Multiply: "+(a*b));
	}
}
