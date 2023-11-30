import java.util.Scanner;
class EvenOrOdd 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number...");
		int num=s.nextInt();

		if(num%2==0)
			System.out.println(" The Given "+num+" is Even ");
		else
			System.out.println(" The Given "+num+" is Odd ");
	}
}
