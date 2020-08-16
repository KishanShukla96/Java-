class array3
{
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter Size of Array = ");
		int sz = sc.nextInt();

		int a[] = new int[sz];			

		for(int i=0 ; i<sz ; i++)
		{
			System.out.print("Enter Value = ");
			a[i] = sc.nextInt();
		}
	}
}