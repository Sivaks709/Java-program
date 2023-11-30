import java.util.*;
class Prime
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[]args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();//11
		if(num==0||num==1)
			System.out.println("NPNC");
		else
		{
			int count=0;
			for (int i=1;i<=num ;i++ )
			{
				if(num%i==0)
					count++;
			}
				//End of the Loop
			if(count==2)
				System.out.println("The Given :"+num+" is Prime");
			else
				System.out.println("The Given :"+num+" is NotPrime");

		}
	}
}