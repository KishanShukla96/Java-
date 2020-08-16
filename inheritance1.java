class parent
{
	private void cat()
	{
		System.out.println("parent's private cat");
	}

	protected void rat()
	{
		cat();
		System.out.println("parent's protected rat");
	}

	public void dog()
	{
		cat();
		System.out.println("parent's public dog");
	}

	void cow()
	{
		cat();
		System.out.println("parent's default cow");
	}
}

class child extends parent
{}

class inheritance1
{
	public static void main(String args[])
	{
		child ch = new child();
		//ch.cat();
		ch.rat();
		ch.dog();
		ch.cow();
	}
}