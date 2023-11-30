class Test5 
{
	static int a=15;
	static{
		int a=14;
		System.out.println(a);
		Test5.a=18;
		System.out.println("Hi Iam SMLI Test 5-"+Test5.a+"-"+a);
	}

	public static void main(String[] args) 
	{
		int res=add(1,2);
		System.out.println(res);
		int res1=Test6.sub(10,5);
		System.out.println(res1);
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
}
