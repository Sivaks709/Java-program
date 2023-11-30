import java.util.Scanner;
class Xylem 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();//23113
		int last=num%10;//3
		int sum=0;
		num/=10;//2311
		while (num>9)//2311>9,231>9,23>9,2>9--False
		{
			sum=sum+(num%10);// 1 + 1 + 3 = 5
			num/=10;//231,23,2
		}
		int first_last=num+last;
		if(first_last==sum)
				System.out.println("Xylem...");
		else
				System.out.println("Not Xylem...");


	}
}
