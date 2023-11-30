class Test2 
{
	final void color()
	{
		System.out.println("Red");
	}

}
class Driver2 extends Test2 
{
	@Override
		public void color()
		{
			System.out.println("White");
		}
	public static void main(String p[])
	{
		Test2 ref1=new Driver2();	
		Test2 ref2=new Test2();	
		ref1.color();
		ref2.color();
	}
}
