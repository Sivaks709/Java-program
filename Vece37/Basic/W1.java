class W1
{
	public static void main(String [] args)
	{
		byte a=5;
		//short<-------byte
		short res=a;//Widening
		System.out.println(a+"---byte Type");//5
		System.out.println(res+"---short Type");//5
	}
}
