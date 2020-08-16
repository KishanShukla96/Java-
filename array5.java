class array5
{
	public static void main(String args[])
	{
		int a[][] = new int[5][];

		a[0] = new int[7];		
		a[1] = new int[18];		
		a[2] = new int[11];		
		a[3] = new int[14];		
		a[4] = new int[4];		

		for(int r=0 ; r<5 ; r++)
		{
			for(int c=0 ; c<a[r].length ; c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
}