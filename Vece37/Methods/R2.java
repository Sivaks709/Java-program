class R2 
{
	static int count=1;
	public static void main(String[] args) 
	{
		m1();
	}
	public static void m1() 
	{
		if(count<=10)
		{
			System.out.println("T 4 Tabrez-"+count
				);
			count++;
			m1();
		}

		return ;
	}
    

}
