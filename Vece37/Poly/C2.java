class P1 
{
	public void dance() 
	{
		System.out.println("Baratanatiyam...");
	}
}
class C2 extends P1
{
	@Override
		public void dance()
		{
			System.out.println("Hip-Hop...");
		}
}
class Driver1 
{
	public static void main(String[] args) 
	{
		P1 ref=new P1();
		C2 ref1=new C2();
		ref1.dance();
		// ref.dance();
	}
}
