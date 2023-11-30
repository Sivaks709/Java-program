class Test1 
{
  private int a=5;
	
	public void m1()
	{
		System.out.println("Hi Iam M1 From Test1 Class");	
	}

	Test1()
	{
		//L.I	
	}
}
class Test2
{
	 static public void main(String [] ar)
	{
		Test1 ref=new Test1();
		System.out.println(ref.a);
		//ref.m1();
	}
}