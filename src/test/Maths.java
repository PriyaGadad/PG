package test;

public class Maths 
{
	public void M2()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
		
		System.out.println("the value of A="+a);
		System.out.println("the value of B="+b);
		System.out.println("sum="+sum);
	}
	
    public static void main(String args[])
    {
    	System.out.println("in main");
    	Maths z=new Maths();
    	z.M2();
    	System.out.println("thanks");
    }


}
