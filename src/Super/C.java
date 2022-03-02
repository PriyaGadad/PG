package Super;

public class C extends B
{
public C()
{
	System.out.println("C class constructor");
}
public void M4()
{
	System.out.println("M4 class of B");
}
public static void main(String[] args) 
{
	B c=new B();
	//c.M1();
	System.out.println(c.b);
}
}
