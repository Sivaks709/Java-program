import java.util.*;
class DigitalSum 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();
		int sum=0,last=0;
		while (num>0)
		{
			last=num%10;
			sum+=last;
			num/=10;
		}
		System.out.println("The Digital Sum is :"+sum);

	}
}
