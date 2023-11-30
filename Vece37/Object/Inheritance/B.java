final class A
{
	int a=10;
	static int b=20;
	public static void m1() 
	{
		System.out.println("Hello World!");
	}
}
class B extends A
{
	int a=40;
	public static void main(String[] args)
	{
		
		A ref=new B();
		B ref2=(B)ref;
		System.out.println(ref2.a);
	}
}