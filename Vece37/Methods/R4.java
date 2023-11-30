import java.util.Scanner;
class R4 
{
	static Scanner s=new Scanner(System.in);
	static int fact=1;//5,20,60,120
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number");
		int num=s.nextInt();//5
		System.out.println(factorial(num));
	}
	public static int factorial(int num)//5,4,3,2,1
	{
		if(num!=1)//4,3,2,1
		{
			fact*=num;
			num--;//4,3,2,1
			factorial(num);
		}
		return fact;
	}
}
