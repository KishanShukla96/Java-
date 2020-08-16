class abc
{
	public void add(int x,int y)
	{
		System.out.println("add = " + (x+y));
	}
	public static void minus(int x,int y)
	{
		System.out.println("minus = " + (x-y));
	}
}

class static_nonstatic_method
{
	public static void main(String args[])
	{
		abc.minus(45,12);	

		abc ob = new abc();
		ob.add(74,52);
	}	
}