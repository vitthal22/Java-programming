import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		OddEven oe = new OddEven();
		oe.CheckNumber(num);
	}

}

class OddEven
{
	public void CheckNumber(int number)
	{
		if (number%2==0)
		{
			System.out.println("Even no.: "+number);
		}
		else {
			System.out.println("Odd no.: "+number);
		}
		
//		return number;
	}
}
