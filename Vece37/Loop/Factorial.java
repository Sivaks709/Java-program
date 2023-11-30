import java.util.Scanner;
class Factorial 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number....");
		int num=s.nextInt();//5
		int fact=1;
		for (int i=2;i<=num ;i++ )//2  3  4  5  6
		{
			fact=fact*i;//120
		}
		System.out.println("The Factorial is :"+fact);
	}
}
