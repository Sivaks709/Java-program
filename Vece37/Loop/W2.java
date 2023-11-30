class W2 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Hi");
		int a=1;
		while(a<=10)
		{
			Thread.sleep(500);
			if(a%2==0)
				System.out.println(a);//if mem
	
			a++;//NFS--while
		}
		System.out.println("Bye...");
	}
}
