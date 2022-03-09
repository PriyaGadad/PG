package PG;

public class Setter
{
	private String colour;
	
public void Country(String c)//setter
{
	this.colour=c;
}
public String Country()//getter
{
	return colour;
}
public static void main(String[] args) 
{
	Setter c=new Setter();
	c.Country("red");
	System.out.println(c.Country());
}

}
