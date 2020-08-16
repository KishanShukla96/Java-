class foreach_demo
{
	public static void main(String args[])
	{
		int a[] = {41,52,63,96,85};

		//old method
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("************");

		//new method
		for(int w : a)
		{
			System.out.println(w);
		}	
	}
}