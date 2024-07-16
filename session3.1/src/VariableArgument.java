
public class VariableArgument {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.add(10,20,30,40,50);
	}

}

class Demo
{
	//var args
	
	public void add(int...a)
	{
		int sum  = 0;
		for(int i:a)
		{
			sum += i;
		}
		System.out.println(sum);
	}
}
