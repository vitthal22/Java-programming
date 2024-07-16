
public class Customer {
	
	static int customercount = 0;
	
	public Customer()
	{
		customercount++;
	}
	
	public static int getcustomercount()
	{
		return customercount;
	}

	public static void main(String[] args) {
		
		System.out.println("count of Customer: "+ Customer.getcustomercount());
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();

		System.out.println("count after class created "+ Customer.getcustomercount());
	}

}

