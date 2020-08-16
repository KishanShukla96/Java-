class greater
{
	private int a,b,c;

	public void setInfo(int x,int y,int z)
	{
		a = x;
		b = y;
		c = z;
	}

	public void onlyif()
	{
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
	}

	public void elseif()
	{
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}

	public void ifelse()
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
	}

	public void ternary()
	{
		int z = (a>b ? a>c ? a  : b : b>c ? b : c);
		System.out.println("greater is = " + z);
	}
}

class condition
{
	public static void main(String args[])
	{
		greater g1 = new greater();
		g1.setInfo(52,93,74);		

		g1.onlyif();
		g1.elseif();
		g1.ifelse();
		g1.ternary();
	}
}