import java.util.Scanner;
class C1 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Any Number...");
		int num=s.nextInt();//10
		String res=(num%2==0)?"Even":"Odd";
		System.out.println(res);
	}
}
