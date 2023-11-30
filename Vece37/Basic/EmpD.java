import java.util.Scanner;
class EmpD
{
	static Scanner m=new Scanner(System.in);
	public static void main(String [] tabbu)
	{
		System.out.println("Enter Your Age...");
		int age=m.nextInt();//48
		System.out.println("Enter Your Salary...");
		double sal=m.nextDouble();//123.0
		System.out.println("Enter Your First Letter...");
		char name=m.next().charAt(0);
		System.out.println("**************************");
		System.out.println("Entered Age is :"+age);
		System.out.println("Entered Salary is :"+sal);
		System.out.println("Entered Firt Letter in Name is :"+name);



	}
}