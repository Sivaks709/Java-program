abstract class A 
{
	abstract public void m1();
}
class B extends A
{
	@Override
		public void m1()
		{
			System.out.println("Body is Provided By B");
		}
	abstract public void m2();
	
}
class C extends B
{
	@Override
	public void m2()
	{
		System.out.println("Body is Provided By C");
	}
	
}
