class P2 
{
	public static void main(String[] args) throws Exception
	{
		int n=11;
		
		for (int i=0;i<n ; i++)
		{
			for (int j=0;j<n ; j++)
			{
				
				Thread.sleep(0);
				if(i<=j-8||i>=j+8||i+j<=n-9||i+j>=n+7||i==j||i+j==n-1){
						if(i==n/2 && j==n/2)
							System.out.print((char)5+" ");
					System.out.print((char)3+" ");
				}
				else{
						if(i<=n/2)
							System.out.print((char)1+" ");
						else if(i>=n/2)
							System.out.print((char)1+" ");
				}
			}
			System.out.println();
		}
	}
}
