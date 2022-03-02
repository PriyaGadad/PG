package Overriding;

public class A 
{
	public void M1(int b)
	{
		System.out.println("hi" + b);
	}
	public void M2(String a)
	{
		System.out.println("hello" + a);
	}
	public static void main(String[] args) 
	{
		A c=new A();
		c.M1(10);
		c.M2("priya");
	}
}
