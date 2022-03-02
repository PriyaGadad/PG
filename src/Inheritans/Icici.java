package Inheritans;

public class Icici extends Hdfc
{
public Icici()
{
	System.out.println("icici constructor");
	
}
public void P3()
{
	System.out.println("icici method");
}
public static void main(String[] args) 
{
	Icici c=new Icici();
	c.P3();
	c.P1();
	c.P2();
	
}
}
