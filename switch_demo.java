import java.util.Scanner;

class switch_demo
{
	public static void main(String args[])
	{
		System.out.println("Press 1 for Add");		
		System.out.println("Press 2 for Minus");		
		System.out.println("Press 3 for Multiply");		
		System.out.println("Press 4 for Divide");		
		System.out.print("\nEnter ur Choice = ");		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		int a=45,b=15,c;

		switch(ch)
		{
			case 1:
				c = a + b;
				System.out.println("add = " + c);
			break;
	
			case 2:
				c = a - b;
				System.out.println("minus = " + c);
			break;
	
			case 3:
				c = a * b;
				System.out.println("multiply = " + c);
			break;
	
			case 4:
				c = a / b;
				System.out.println("divide = " + c);
			break;
	
			default:
				System.out.println("invalid choice");
		}
	}
}