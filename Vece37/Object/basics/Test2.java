class Test2 
{
	//NSMI
	{
		System.out.println("Hi Iam NSMLI");
	}
	boolean b;//NSVD
	double d=14;//NSSLI
	//NSM
	public int add(int a,int b)
	{
		return a+b;
	}
	//constructors
	Test2()
	{
		//Load inst
		System.out.println("Hi From No-Arg Const");//PWI
	}
	
	Test2(int a)
	{
		//Load inst
		System.out.println("Hi From Parameterized Const-"+a);
	}
	Test2(String s,int a)
	{
		//Load inst
		System.out.println("Hi From Parameterized Const-"+s+"-"+a);
	}
}
