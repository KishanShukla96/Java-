class A
{
	public void cat()
	{
		System.out.println("A ki cat");
	}
}

class B extends A
{
	public void rat()
	{
		System.out.println("B ka rat");
	}
}

class C extends B
{
	public void dog()
	{
		System.out.println("C ka dog");
	}
}

class D extends C
{
	public void cow()
	{
		System.out.println("D ki cow");
	}
}

class inheritance2
{
	public static void main(String...s)
	{
		D ob = new D();
		ob.cat();
		ob.rat();
		ob.dog();
		ob.cow();
	}
}