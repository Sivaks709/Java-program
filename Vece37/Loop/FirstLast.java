import java.util.Scanner;
class FirstLast 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number....");
		int num=s.nextInt();//1232
		int last=num%10;//2
		while (num>9)//1232>9,123>9,12>9,1>9
		{
			num/=10;//123,12,1
		}
		int first_last=num+last;
		System.out.println("First and Last Sum is :"+first_last);
	}
}