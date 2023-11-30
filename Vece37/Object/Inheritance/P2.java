class P2
{

	final static int A;

		static{
			A=10;
			System.out.println(A);
			
		}
	final int B;

	{
		B=15;
	}
	
	public static void main(String [] args)
	{
		P2 ref=new P2();
		System.out.println(ref.B);
	}

}