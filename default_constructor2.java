class abc extends Object
{
	int a;
	float b;
	boolean c;
	char d;
	String e;

	public abc()
	{
		a = 34;
		b = 45.12f;
		c = true;
		d = 'r';
		e = "mohit";
	}
}

class default_constructor2
{
	public static void main(String args[])
	{
		abc ob = new abc();
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		System.out.println(ob.e);
	}
}