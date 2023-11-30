class Test3 
{
	final static  int A;

	static{
		A=10;
		//A=15 CTE
	}
	final int B;

	{
		B=20;
	}

	public static void main(String p[])
	{
		System.out.println(A);
		System.out.println(new Test3().B);
	}
}
