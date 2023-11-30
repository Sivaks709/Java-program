import java.util.Scanner;
class Hotel 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Select The Food");
		System.out.println("1.Idli\n2.Biryani\n3.Pongal");
		switch (s.nextInt())
		{
		case 1:System.out.println("Idli Price is 45");
				break;
		case 2:System.out.println("Biryani Price is 145");
				break;
		case 3:System.out.println("Pongal Price is 54");
				break;
		
		}
	}
}
