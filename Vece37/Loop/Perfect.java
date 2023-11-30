import java.util.*;
class Perfect
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();
		int sum=0;
		for (int i=1;i<num ;i++ )
		{
				if(num%i==0)
					sum+=i;
				System.out.println(num%i+" : "+i);
		}
		if(sum==num)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");

	}
}