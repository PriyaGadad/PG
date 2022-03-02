package Inheritans3;

public class Son extends Father
{
	public Son()
	{
		System.out.println("Son constructor");
	}
	public void M2()
	{
		System.out.println("method of Son");
	}
	public static void main(String[] args) 
	{
		Son a=new Son();
		a.M2();
		
	}

}
