import java.util.Scanner;
class Palindrome 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number....");
		int num=s.nextInt();
		int rev=0,temp=num;
		while (num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		String res=(rev==temp)?"Palindrome":"Not Palindrome";
		System.out.println(res);
	}
}
