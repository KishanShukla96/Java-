class abc
{
	//argument with return value
	public int add1(int x,int y)
	{
		int z = x + y;
		return z;
	}

	//argument with no return value
	public void add2(int x,int y)
	{	
		int z = x + y;
		System.out.println("add2 = " + z);
	}

	//no argument with return value
	public int add3()
	{
		int x=15,y=10,z;
		z = x + y;
		return z;
	}

	//no argument with no return value
	public void add4()
	{
		int x=15,y=10,z;
		z = x + y;
		System.out.println("add4 = " + z);
	}
}

class method_prototype
{
	public static void main(String args[])
	{
		abc aa = new abc();
		
		int w = aa.add1(15,10);
		System.out.println("add1 = " + w);

		aa.add2(15,10);

		int r = aa.add3();
		System.out.println("add3 = " + r);

		aa.add4();
	}
}