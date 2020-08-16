import java.util.Scanner;
import java.lang.System;

class scanner_demo
{
	public static void main(String str[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a = ");
		float a = sc.nextFloat();

		System.out.print("Enter b = ");
		float b = sc.nextFloat();

		float c = a + b;
		System.out.println(c);
	}
}



