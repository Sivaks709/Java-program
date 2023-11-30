import java.util.Scanner;
class Tables 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter The Starting Value");
		int start=s.nextInt();//2
		System.out.println("Enter The Starting Value");
		int end=s.nextInt();//2
		
		for (int i=1,s=start,e=end;s<=e ;i++ )
		{
			Thread.sleep(150);
			System.out.println(s+" * "+i+" = "+start*i);
			if(i==10)
			{
				i=0;
				s++;
				System.out.println("**********************");
			}
		}
	}
}
