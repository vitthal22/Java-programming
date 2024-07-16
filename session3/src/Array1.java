import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[5];
		
//		arr[0] = 10;
//		arr[1] = 10;
//		arr[2] = 10;
//		arr[3] = 10;
//		arr[4] = 10;
		
//		for(int i=0; i<arr.length;i++)
//		{
//			System.out.println("Emter no. ");
//			
//			arr[i] = sc.nextInt();
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		
		//2D Array in Java
		
//		int marks[][] = new int[2][5];
//		
//		for(int i=0;i<2;i++)
//		{
//			System.out.println("Enter mrks of div"+(i+1));
//			for(int j=0;j<5;j++)
//			{
//				System.out.println("Enter marks of Std: "+(j+1));
//				marks[i][j] = sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<2;i++)
//		{
//			System.out.println("Enter mrks of div"+(i+1));
//			for(int j=0;j<5;j++)
//			{
//				System.out.println("Enter marks of Std: "+(j+1));
//			    System.out.println("marks: "+marks[i][j]);
//			}
//		}
		
		//2D jagged Array
		
		int marks[][] = new int[2][];
		marks[0] = new int[7];
		marks[1] = new int[5];
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter mrks of div"+(i+1));
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.println("Enter marks of Std: "+(j+1));
				marks[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter mrks of div"+(i+1));
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.println("Enter marks of Std: "+(j+1));
			    System.out.println("marks: "+marks[i][j]);
			}
		}
		
		
		
		
		
	}	
}
