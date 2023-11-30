class W2 
{
	public static void main(String[] args) 
	{
		int a=15;
		//double<-------int

		double res=a;
		System.out.println(a+"----int type");//15
		System.out.println(res+"----double type");//15.0
		System.out.println("******************************");
			byte b=5;
		//short<-------byte
		short res1=b;//Widening
		System.out.println(b+"---byte Type");//5
		System.out.println(res1+"---short Type");//5
	}
}
