class F1 
{
	public static void main(String[] args)throws Exception 
	{
		char ch='A';
		for (int i=1;i<=5 ;i++ )
		{
			Thread.sleep(150);
			System.out.println(ch);
			ch++;
		}
	}
}
