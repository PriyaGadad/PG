package This2;

 

public class C 
{

	public void M1()
	{
		System.out.println(this);
	}
	public static void main(String[] args)
	{
		
		C c=new C();
		c.M1();
		System.out.println(c);
	}
}
