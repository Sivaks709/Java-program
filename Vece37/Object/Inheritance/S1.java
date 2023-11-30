import java.util.Scanner;
class S1 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Id ");
		int id=s.nextInt();
		System.out.println("Enter Your Name");
		s.nextLine();//to read b.M
		String name=s.nextLine();
		System.out.println("*****************");
		System.out.println("The Entered Id is :"+id);
		System.out.println("The Entered Name  is :"+name);
	}
}
