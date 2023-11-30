//with out taking input from user
import java.util.Scanner;
class Age 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Age");
		int age=s.nextInt();//<----input
		System.out.println("The Age Entered is "+age);
	}
}
