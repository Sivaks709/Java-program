import java.util.Scanner;
class Remote 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("1.Power Off\n2.Power On\n3.Volume Inc\n4.Mute\n");
		System.out.println("Enter The Button");
		int button=s.nextInt();//Integer is Readed
		if(button==1)//1==1
		{
			System.out.println("Power Off..");
		}

		if(button==2)//2==2
		{
			System.out.println("Power ON..");
		}

		if (button==3)
		{
			System.out.println("Volume is Being Increased..");
		}

		if (button==4)
		{
			System.out.println("Mute..");
		}

		if (button>4)
		{
			System.out.println("I Can Understand You Are Blind.....");
		}
	}
}
