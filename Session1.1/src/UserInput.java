import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//java.util to import the string
		
		System.out.println("Enter age:");
		int a = sc.nextInt();
		System.out.println("age is: "+a);
		
		System.out.println("Enter marks:");
		float marks = sc.nextFloat();
		System.out.println("marks is: "+marks);
		
		System.out.println("Enter first name:");
		String name = sc.next();
		System.out.println("Name is: "+name);
		
		System.out.println("Enter name:");
		String name1 = sc.nextLine();
		System.out.println("Name is: "+name1);
		
		System.out.println("Enter grade:");
		char grade = sc.next().charAt(0);
		System.out.println("Grade is: "+grade);
		
		System.out.println("Enter true or false:");
		boolean b = sc.nextBoolean();
		System.out.println("Data is: "+b);
	}

}
