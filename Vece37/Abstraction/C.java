abstract interface A 
{
	abstract public void m1();
	// public static void main(String[] args) {
	// 	System.out.println("123456789");
	// }
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
		System.out.println("m2 Body is Provided By C");
	}
	public void m1() {
		System.out.println("m1 Body is Provided By C");
	}
}
