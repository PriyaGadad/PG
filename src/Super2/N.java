package Super2;

public class N extends M
{
	public N()
	{
		System.out.println("L constructor ");
	}
	
	public void M2()
	{
		System.out.println("Method of L class");
	}
	public static void main(String[] args)
	{
		M c=new M();
		c.M1();
	}
}
