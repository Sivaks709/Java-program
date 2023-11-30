import java.util.Scanner;
class StrongNumber 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();
		int temp=num,sum=0,fact=1,last=0;
		while (num>0)//145>0,14>0,1>0,0>0
		{
			last=num%10;//5,4,1
			fact=1;
			for (int i=1;i<=last ;i++ )
			{
				fact*=i;
			}
			//fact-->120,24,1
			sum+=fact;//120,144,145
			num/=10;//14,1,0
		}

		if(temp==sum)
			System.out.println("Strong...");
		else
			System.out.println("Not Strong...");

	}
}
