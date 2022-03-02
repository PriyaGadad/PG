package Inheritance2;

public class Grapes extends Mango
{
public Grapes()
{
	System.out.println("grapes constructor");
}
public void A3()
{
	System.out.println("grapes method");
}
public static void main(String[] args) 
{
	Apple a=new Mango();
	
	Mango b=new Grapes();
	
	a.A1();
	b.A2();
	System.out.println(a.a);
	System.out.println(b.a);
}
}
