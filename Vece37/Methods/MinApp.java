import java.util.Scanner;
class MinApp 
{
	static Scanner s=new Scanner(System.in);
	static boolean b=true;
	public static void main(String[] args) 
	{
			System.out.println("\t\t Vannakam to My App\n");
			System.out.println("Select the Input\n");
			System.out.println("1.Prime \n2.Factorial\n3.Exit");
			int input=s.nextInt();//1
			switch (input)
			{
				case 1:{
						// To Check given is Prime or Not
						System.out.println("Please Enter The Number..");
						int a=s.nextInt();
						if(isPrime(a))
							System.out.println("The Given :"+a+" is Prime");
						else
							System.out.println("The Given :"+a+" is Not Prime");
				break;}
			case 2:{
				//Factorial
						System.out.println("Please Enter The Number..");
							int a=s.nextInt();//5
							int res=factorial(a);
							System.out.println("The Factorial "+a+" is : "+res);
			
				break;}
			case 3:{
				b=false;
				System.out.println("\t\t\t Thank You");
				break;}
			
			}
			 

		}
	public static boolean isPrime(int num)//11
	{
		int count=0;
		for (int i=1;i<=num ;i++ )
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
	public static int factorial(int num)//5
	{
		int fact=1;
		for (int i=2;i<=num ;i++ )
			fact*=i;
		
		return fact;
	}
}
