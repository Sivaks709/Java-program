abstract interface A 
{
	abstract public void m1();
}
abstract interface B extends A
{
		public void m1();
	abstract public void m2();
	
}
class C implements B
{
	@Override
	public void m2()
	{
		System.out.println("Body is Provided By C");
	}
	
}
