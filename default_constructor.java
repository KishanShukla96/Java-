class abc extends Object
{
	public void display()
	{
		System.out.println("hello : " + hashCode());
	}
}

class default_constructor
{
	public static void main(String args[])
	{
		abc ob = new abc();
		ob.display();
		ob.display();
		ob.display();
		
		System.out.println("--------------------");

		new abc().display();
		new abc().display();
		new abc().display();
	}
}