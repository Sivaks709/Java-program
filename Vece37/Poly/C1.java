class P1 
{
	int a=10;
	P1()
	{
		//L.i
	}
}
class C1 extends P1
{
	int a=20;
	//const
	C1()
	{
		//super();
	}
	public static void main(String [] args)
	{
		P1 ref1=new C1();
		C1 ref2=new C1();
		System.out.println(ref1.a);//10
		System.out.println(ref2.a);//20
	}
}