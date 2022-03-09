package Overriding;

public class B extends A
{
	public void M1(int c)
	
	{
		super.M1(c);
		System.out.println("B class method" + c);
	}
	public void M2(String d)
	{
		System.out.println("M2 of B class method" + d);
	}
	
}
