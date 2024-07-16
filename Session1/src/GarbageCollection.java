
public class GarbageCollection {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		s = null;
		
		System.gc();
		
	}

}

class Sample
{
	protected void finalize()
	{
		System.out.println("Object is deleted");
	}
}
