package Polymortism2;

public class C extends B
{
public void M1()
	{
		System.out.println(" C class of method");
	}
public static void main(String[] args) 
{
	C a=new C();
	a.M1();
	a.M1(10);
	a.M1("bappa");
	a.M1(false);
	a.M1(10.5);
	
}
}

