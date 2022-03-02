package Polymortism;

public class P3 extends P2
{
	public void M1(boolean p)
	{
		System.out.println("P3 class Boolean M1 method"+p);
	}
		
	public void M1(byte z) 
	{
		System.out.println("value of byte of P3 class"+z);
	}
	public static void main(String[] args) 
	{
		P3 a=new P3();
		a.M1(true);
		a.M1(10);
		a.M1("pri");
		a.M1(10.5);
		a.M1(10);
		a.M1(10);
	}
}
