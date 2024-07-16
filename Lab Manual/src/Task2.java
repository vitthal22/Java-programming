import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		FactorialNo fn = new FactorialNo();
		fn.Number(num);
	}

}

class FactorialNo
{
	public void Number(int num)
	{
		int sum = 1;
		if (num>0)
		{
			for(int i=1;i<=num;i++)
			{
				sum *= i;
			}
			System.out.println("Factorial of no. is "+sum);
		}
		else {
			System.out.println("Error");
		}
	}
}