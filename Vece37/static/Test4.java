class Test4 
{
	static int a=14;
	static boolean b;

	static
	{
		int b=20;
		System.out.println("Hi Iam SMLI-1");
		System.out.println(b);

	}
	public static void main(String[] args) 
	{
		int a=18;
		System.out.println("Hi Iam Main");
		System.out.println(a);
	}

	static
	{
		System.out.println("Hi Iam SMLI-2");
		System.out.println(a);

	}
}
