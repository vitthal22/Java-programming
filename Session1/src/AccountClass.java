
public class AccountClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Acc = new Account();
		Acc.setAccNo(111);
		Acc.setOwnerName("Vitthal");
		Acc.setBalance(33535.326);
		
		System.out.println("Account no. is "+Acc.getAccNo());
		System.out.println("Account Owner name is "+Acc.getOwnerName());
		System.out.println("Account Balance is "+Acc.getBalance());
	}

}

class Account
{
	int accNo;
	String ownerName;
	double balance;
	
	public void setAccNo(int a)
	{
		accNo = a;
	}
	public void setOwnerName(String o)
	{
		ownerName = o;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	
	
	public int getAccNo()
	{
		return accNo;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public double getBalance()
	{
		return balance;
	}
	
}
