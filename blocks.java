class moon
{
	int a;
	static int b;
	
	static
	{
		System.out.println("static block 3 : " + b);
	}

	{
		System.out.println("initializer block : " + a+","+b);
	}

	static
	{
		System.out.println("static block 1 : " + b);
	}

	public moon()
	{
		System.out.println("constructor block");
	}

	public void display()
	{
		System.out.println("method block");
	}

	static
	{
		System.out.println("static block 2 : " + b);
	}
}

class blocks
{
	public static void main(String args[])
	{
		moon m1 = new moon();		
		moon m2 = new moon();		
		moon m3 = new moon();		
		moon m4 = new moon();
		m1.display();		
	}
}