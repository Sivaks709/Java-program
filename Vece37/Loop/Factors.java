import java.util.*;
class Factors 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();
		for (int i=1;i<=num ;i++ )
		{
				if(num%i==0)
					System.out.println("The Factors of "+num+" are :"+i);
		}
	}
}