package This;

public class B 
{
public B()
{
	System.out.println("pri");
}

public B(String a)
{
	this();
	System.out.println(a);
}

public static void main(String[] args) 
{
	
	
	B c=new B("ya");
	
}

}
