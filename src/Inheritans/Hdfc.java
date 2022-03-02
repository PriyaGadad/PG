package Inheritans;

public class Hdfc extends Citi
{
public Hdfc()
{
	System.out.println(" HDFC construcor");
}
public void P2()
{
	System.out.println("hdfc method");
}
public static void main(String[] args) 
{
	Hdfc b=new Hdfc();
	b.P2();
}
}
