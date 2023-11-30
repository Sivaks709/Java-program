class Test 
{
	final public static void m1() 
	{
		System.out.println("Hello World!");
	}

	final public  void m2() 
	{
		System.out.println("Hello Earth!");
	}


	
}
class Driver1 extends Test
{
	public static void main(String [] r)
	{
		Driver1 ref1=new Driver1();
		ref1.m1();
		ref1.m2();
	}

}
