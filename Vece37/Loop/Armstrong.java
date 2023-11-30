import java.util.Scanner;
class Armstrong 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The NUmber...");
		int num=s.nextInt();//153
		int temp=num,last=0,product=1,count=0,sum=0;
		//Creating loop fr Counting
		while (num>0)
		{
			num/=10;
			count++;
		}
	//count is 3
		num=temp;
		while(num>0)//153>0,15>0,1>0,0>0
		{
			last=num%10;//3,5,1
			product=1;
			//Creatring loop for Multiplication
			for (int i=1;i<=count ;i++ )
			{
				product*=last;
			}
			//product-->27,125,1
			sum+=product;//27,152,153
			num/=10;//15,1,0
			
		}
		if(temp==sum)
			System.out.println("Armstrong...");
		else
			System.out.println("Not Armstrong...");

	}
}
