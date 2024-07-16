
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.getInterestRate();
	}

}

class Account
{
	static float intrestRate;
	
	static
	{
		intrestRate = 6.5f;
	}
	
	public static void getInterestRate()
	{
		System.out.println("Account Interest is "+intrestRate);
	}
}
