import java.util.Scanner;
class Hotel 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Select Your Hotel...\n");
		System.out.println("1.Pandian's\n2.Star Biryani\n3.A2B\n4.Amma Hotel\n");
		int hotel_in=s.nextInt();//2
		if (hotel_in==1)
		{
			//Pandians
			System.out.println("\t\t Thank You For Selecting Pandian's\n");
			System.out.println("1.MushRoom Biryani\n2.Mutton Biryani");
		}
		else if(hotel_in==2)
		{
			
			//Start Biryani
			System.out.println("\t\t Thank You For Selecting Star Biryani\n");
			System.out.println("Chichen Biryani\nRabbit Biryani");
		}
		else if(hotel_in==3)
		{
			
			//A 2 B
			System.out.println("\t\t Thank You For Selecting A2B\n");
			System.out.println("Curry Leaves\nCarrot ");
		}
		else if(hotel_in==4)
		{
			
			//Amma Hotel
			System.out.println("\t\t Thank You For Selecting Amma Hotel's\n");
			System.out.println("Curd Rice\nPongal");
		}
		else
			System.out.println("I Know Your Mental Health is Not Good");
	}
	
}
