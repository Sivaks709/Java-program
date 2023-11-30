import java.util.Scanner;
class Counting 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number...");
		int num=s.nextInt();//8364
		int temp=num;
		int count=0;
		while (num>0)//8364>0,836>0,83>0,8>0,0>0
		{
			num/=10;//836,83,8,0
			count++;//1,2,3,4
		}
		System.out.println("The Total Digits in "+temp+" is :"+count);

	}
}
