import java.util.*;
class D1 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter m:");
		int m=s.nextInt();//2
		int n=1;
		do
		{
			if(n==6)
				m++;
			Thread.sleep(150);
			System.out.println(m+" * "+n+" = "+m*n);
			n++;
		}
		while (n<=10);//1-10
	}
}
