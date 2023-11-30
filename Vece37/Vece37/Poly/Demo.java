class Test 
{
	public static void m1() 
	{
		System.out.println("Java");
	}
}
class Demo extends Test
{
	
	public static void m1() 
	{
		System.out.println("Python");
	}
	public static void main(String [] args)
	{
		Test t=new Demo();
		t.m1();
		Test.m1();
		Demo.m1();
	}
}
