class pnb
{
	public int sa;

	public void cashier_deposit(int x)
	{
		sa = x;
	}

	public void passbook()
	{
		System.out.println("Saving Account = " + sa);
	}

	public static void swap1(int x,int y)
	{
		int z = x;
		x = y;
		y = z;
	}

	public static void swap2(pnb x,pnb y)
	{	
		int z = x.sa;
		x.sa = y.sa;
		y.sa = z;
	}
}

class method_reference
{
	public static void main(String args[])
	{
		pnb amit = new pnb();
		amit.cashier_deposit(5000);
		amit.passbook();

		pnb neha = new pnb();
		neha.cashier_deposit(8000);
		neha.passbook();

		pnb.swap1(amit.sa,neha.sa);
		System.out.println("\nafter swapping (call by value)");
		amit.passbook();
		neha.passbook();

		pnb.swap2(amit,neha);
		System.out.println("\nafter swapping (call by reference)");
		amit.passbook();
		neha.passbook();
	} 
}