package Polymortism2;


public class A 
{
public void M1(int a) 
{
	System.out.println("A class of int method " +a);
}
public void M1(String b)
{
	System.out.println("A class of String method " +b);
}
public static void main(String[] args)
{
	A a=new A();
	
}
}
