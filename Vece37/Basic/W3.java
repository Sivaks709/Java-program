class W3 
{
	static long a=45;
	//float<--------long
	static float res=a;//W
	static char ch='A';
	public static void main(String[] args) 
	{
		System.out.println(a+"--long type");//45
		System.out.println(res+"--float type");//45.0
		int h=13;
		//double<----float
		double res1=res;//W
		System.out.println(a+"---long type");//45
		System.out.println(res1+"---double type");//45.0
		//float<------int
		res=h;//W
		System.out.println(h+"----int type");//13
		System.out.println(res+"----float type");//13.0
		//int<--------char
		int res3=ch;//'A'----65
		System.out.println(ch+"---char type");//A
		System.out.println(res3+"---int type");//65
	}
}
