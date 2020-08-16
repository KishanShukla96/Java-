class array4
{
	public static void main(String args[])
	{
		int a[][] = new int[3][15];

		for(int r=0 ; r<3 ; r++)
		{
			for(int c=0 ; c<15 ; c++)
			{
				System.out.print(a[r][c]+" ");
			}
	
			System.out.println();
		}		
	}
}