import java.util.Scanner;
class S1 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();//46
		int rem=num%2;//--->0
		switch (rem)
		{
		case 0:System.out.println(num+" : is Even");
					break;
		case 1:System.out.println(num+" : is Odd");
		
		}
	}
}
