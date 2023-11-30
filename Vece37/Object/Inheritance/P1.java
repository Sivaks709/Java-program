class P1 extends String 
{
	final public static void m1() 
	{
		System.out.println("Hello World!");
	}
}
class P2 extends P1
{
	public static void main(String [] args)
	{
		m1();
	}
}
