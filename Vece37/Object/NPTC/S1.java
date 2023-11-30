import java.util.Scanner;
class S1 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Id");
		int id=s.nextInt();
		System.out.println("Enter Your Name");
		s.nextLine();//Eat Enter Key in B.M
		String name=s.nextLine();//wait
		System.out.println("************************");
		System.out.println(id);
		System.out.println(name);

	}
}
