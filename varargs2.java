class abc
{
	public static void add(String...x)
	{
		int s=0;
		for(String z : x)
		{
			s = s + Integer.parseInt(z);
			System.out.println(z);
		}
		System.out.println("Total = " + s);
	} 
}

class varargs2
{
	public static void main(String args[])
	{
		abc.add(args);
	}
}