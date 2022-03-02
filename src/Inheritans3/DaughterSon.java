package Inheritans3;

public class DaughterSon extends Son
{
	public DaughterSon()
	{
		System.out.println("DaughterSon constructor");
	}
	public void M3()
	{
		System.out.println("method of DaughterSon");
	}
	public static void main(String[] args) 
	{
		Son b=new Son();
		b.M2();
		b.M1();
	}
}
