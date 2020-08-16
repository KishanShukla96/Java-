class loop
{
	public static void main(String args[])
	{
		System.out.println("FOR LOOP");
		for(int i=15 ; i<=10 ; i++)
		{
			System.out.print(i+" ");
		}
	
		System.out.println("\n\nWHILE LOOP");
		int k=15;
		while(k<=10)
		{
			System.out.print(k+" ");
			k++;
		}

		System.out.println("\n\nDO-WHILE LOOP");
		int m=15;
		do
		{
			System.out.print(m+" ");
			m++;
		}
		while(m<=10);
	}
}