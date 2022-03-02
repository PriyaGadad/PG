package Super;

public class B extends A
{
	int b=20;
public B()

{
	
	System.out.println("B class constructor");
}
public void M1()
{
	
	int a=35;
	super.M1();
	System.out.println(a);
	
}
public void M3()
{
	System.out.println("M3 class of B");
}
public static void main(String[] args) 
{
	
}
}
