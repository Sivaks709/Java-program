class Test4 
{
	static int a=44;
	public static void main(String[] args) 
	{
		System.out.println("Hi Iam Main");
		int res=demo("Tabrez",true);
		System.out.println(res);
		System.out.println("Bye From Main");
	}
	public static int demo(String s,boolean b)
	{
		if(b)
			System.out.println("Hi From Demo-"+s);
		else
			System.out.println("Bye From Demo-"+s);

		return a;
	}
}
