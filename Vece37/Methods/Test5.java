class Test5 
{
	public static void main(String[] args) 
	{
		System.out.println(m1(4,false));
		if(m2(4,6))
			System.out.println(m1(8,false));

		System.out.println("Bye");
	}
	public static String m1(int a,boolean b)
	{
		String s="JDBC";
		if(m2(4,4))
			System.out.println("Hi Iam M1");
		else
			System.out.println("Bye From M1");
		
		return s;
	}
	public static boolean m2(double a,double b)
	{
		if(a==b)
			return  true;
		else
			return false;
	}
}
