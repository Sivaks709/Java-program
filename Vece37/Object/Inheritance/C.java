//Program related to static Methods inheritance
class A 
{
	//SMLI
	static{
		System.out.println("Hi Iam Parent SMLI-A");
	}
	//SM
	public static void m1()
	{
		System.out.println("Hi From M1...");
	}
}
class B extends A
{
	//SMLI
	static{
		System.out.println("Hi Iam Chile SMLI-B");
	}
	//SM
	public static void m2()
	{
		System.out.println("Hi From M2...");
	}
}
class C extends B
{
	//SMLI
	static{
		System.out.println("Hi Iam Child SMLI -C");
	}
	//SM
	public static void m3()
	{
		System.out.println("Hi From M3...");
	}
	//SM
	public static void main(String [] ar)
	{
		m1();
		m2();
		m3();
	}
}

