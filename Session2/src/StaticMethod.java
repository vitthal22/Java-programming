
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample s = new Sample();
//		s.temp();
		
		Sample.DoWork();
	}

}

class Sample
{
	static int a = 10;
	
	//Non-Static method
	public void temp()
	{
		System.out.println("in temp method"+a);
	}
	
	//Static Method 
	public static void DoWork()
	{
		System.out.println("in dowork method"+a);
	}
}
