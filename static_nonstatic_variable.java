class abc
{
	int a;		//will create individual memory with each object
	static int b;	//will share common memory with each object
}

class static_nonstatic_variable
{
	public static void main(String args[])
	{
		abc kk = new abc();
		abc pp = new abc();
		abc nn = new abc();

		kk.a = 50;
		kk.b = 100;
		
		System.out.println(kk.a + "," + kk.b);				
		System.out.println(pp.a + "," + pp.b);				
		System.out.println(nn.a + "," + nn.b);				
		System.out.println("***************");

		
		pp.a = 15;
		pp.b = -30;
		
		System.out.println(kk.a + "," + kk.b);				
		System.out.println(pp.a + "," + pp.b);				
		System.out.println(nn.a + "," + nn.b);				
		System.out.println("***************");	

		
		nn.a = 500;
		nn.b = 900;
		
		System.out.println(kk.a + "," + kk.b);				
		System.out.println(pp.a + "," + pp.b);				
		System.out.println(nn.a + "," + nn.b);				
		System.out.println("***************");			
	}	
}