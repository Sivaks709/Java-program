class R5 
{
	static int count=3,n3=0;
	public static void main(String[] args) 
	{
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		fibonacci(n1,n2);
	}
	public static void fibonacci(int n1,int n2)
	{
		if(count<=10)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			count++;
			fibonacci(n1,n2);
		}
	}
}
