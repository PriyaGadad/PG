package Super3;

public class A3 extends A2
{
	public A3()
	{
		System.out.println("A3 constructor of A class");
	}
	public void M1()
	{
		System.out.println("M1 method of A3 class ");
	}
	public static void main(String[] args) 
	{
		A2 a=new A2();
		a.M1();
	}
}
