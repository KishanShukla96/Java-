class abc
{
	public static void add(int...x)
	{
		int s=0;
		for(int z : x)
		{
			s = s + z;
			System.out.println(z);
		}
		System.out.println("Total = " + s);
	} 
}

class varargs1
{
	public static void main(String args[])
	{
		abc.add(45,76,22,88,99);
	}
}