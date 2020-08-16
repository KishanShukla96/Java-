class abc extends Object
{
	public void add(int x,int y)
	{
		System.out.println("add = " + (x+y));
	}
}

//IS-A (logically)
class xyz extends abc
{}

//HAS-A (physical)
class mno extends Object
{
	abc aa = new abc();	
}

//USES-A (physical)
class pqr extends Object
{
	public void display()
	{
		abc aa = new abc();
		aa.add(45,12);
	}
}

class relations extends Object
{
	public void show()
	{
		System.out.println("i am in main");
	}

	public static void main(String...args)
	{
		xyz xx = new xyz();		
		xx.add(45,12);

		mno mm = new mno();
		mm.aa.add(45,12);

		pqr pp = new pqr();
		pp.display();

		relations rr = new relations();
		rr.show();
	}
}