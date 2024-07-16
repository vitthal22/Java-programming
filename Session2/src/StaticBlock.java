
public class StaticBlock {
	
	static {
		
		System.out.println("static block is invoked");
	}

	public static void main(String[] args) {
		
		System.out.println("hello");	
	}
	
	static {
		
		System.out.println("2 static block is invoked");
	}

}
