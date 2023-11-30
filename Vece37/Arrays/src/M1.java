import java.util.Scanner;

//MDA
public class M1
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		int [][]a=new int[3][3];
		//Loop is only for Storing
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.println("Enter The Element");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("*************************************");
		//Loop for Printing
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
				Thread.sleep(200);
			}
			System.out.println();
		}
	}
}
