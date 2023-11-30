class L1 
{
	static boolean a;//false,true
	public static void main(String[] args) 
	{
		boolean a=true;
		System.out.println(a);//true
		System.out.println(L1.a);//false
		System.out.println(!(!(L1.a)));//false
		L1.a=!(false);
		System.out.println(true || !(L1.a==L1.a));
	}
}
