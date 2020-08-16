class labled_loop
{
	public static void main(String args[])
	{
		cat:for(int i=1 ; i<=3 ; i++)
		{
			rat:for(int k=1 ; k<=3 ; k++)
			{
				if(i==2)
				{
					break cat;
				}

				System.out.println(i+","+k);	
			}

			System.out.println("***********");
		}	
	}
}