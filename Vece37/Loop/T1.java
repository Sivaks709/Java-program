class T1 
{
	public static void main(String[] args) throws Exception
	{
		for (int i=0;i<=4 ;i++ )
		{
			System.out.print(i+"->");

			for (int j=1;j<=4 ;j++ )
			{
				Thread.sleep(150);
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
