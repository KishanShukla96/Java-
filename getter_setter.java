class student
{
	private String name;
	private int roll;
	private String password;

	//setter
	public void setName(String s)
	{
		name = s;
	}
	public void setRoll(int x)
	{
		roll = x;
	}
	public void setPassword(String s)
	{
		password = s;
	}

	//getter
	public void getRoll()
	{
		System.out.println("Roll = " + roll);
	}
	public void getName()
	{
		System.out.println("Name = " + name);
	}
	public void getPassword()
	{
		System.out.println("Password = " + password);
	}

}

class getter_setter
{
	public static void main(String args[])
	{	
		student s1 = new student(); 
		s1.setName("kamal");
		s1.setRoll(101);
		s1.setPassword("moon123");

		s1.getRoll();
		s1.getPassword();
		s1.getRoll();
		s1.getName();

		s1.setName("mohit");
		s1.getName();
	} 
}