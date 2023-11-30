class D3 
{
	static int num=1523;//1523
	static int g=num;
	public static void main(String[] args) 
	{
		System.out.println("Inital Given Num :"+num);//1523
		num=num/10;//3
		System.out.println(num=num/10);
		g=num;
		System.out.println(g);
		num=num%10;
		System.out.println("The resultant:"+num);
	}
}
