package This2;

public class A 
{
public A()
{
	System.out.println("A constrctor");
}
public void M1()
{
	System.out.println(this);
}
public static void main(String[] args) 
{
	A a=new A();
	a.M1();
}
}
