class moon
{
	public void add(int x,int y)
	{
		System.out.println("moon int add = " + (x+y));
	}
	public void add(long x,long y)
	{
		System.out.println("moon long add = " + (x+y));
	}
}

class star extends moon
{
	public void add(int x,int y)
	{
		System.out.println("star int add = " + (x+y));
	}
	public void add(long x,long y)
	{
		System.out.println("star long add = " + (x+y));
	}
}