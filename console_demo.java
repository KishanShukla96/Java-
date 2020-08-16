import java.io.Console;
import java.lang.System;

class console_demo
{
	public static void main(String args[])
	{
		Console con = System.console();
		
		System.out.print("Enter a = ");
		String s1 = con.readLine();
		float a = Float.parseFloat(s1);	
	
		System.out.print("Enter b = ");
		String s2 = con.readLine();
		float b = Float.parseFloat(s2);	
	
		float c = a + b;
		System.out.println(c);

		System.out.print("Enter Password = ");
		char pass[] = con.readPassword();
		
		for(int i=0 ; i<pass.length ; i++)
		{
			System.out.print(pass[i]);
		}
	}
}