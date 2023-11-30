import java.util.Scanner;
class UserInterface 
{
	static Scanner s=new Scanner(System.in);
	static boolean b=true;
	static Mobile m=new Mobile("Mi","8gb",128);
	public static void main(String[] args) 
	{
		do{
			System.out.println("\t\t ***Welcome To PoorVika*****\n");
			System.out.println("Select The Input\n");
			System.out.println("1.Display Mobile Details\n2.Display Sim Details\n3.Is Sim Slot Empty\n4.Insert Sim\n5.Remove Sim\n6.Exit\n");
			int user_in=s.nextInt();
			switch (user_in)
			{
				case 1:m.detailsOfMobile();
				{
					break;
				}
				case 2:
				{
					if(m.isSimSlotEmpty())
					{
						m.slot.detailsOfSim();
					}
						//display sim details
						
					else
					{
						System.out.println("Can't Display Sim Details BEcause Thier is No Sim");
					}
					break;
				}
				case 3:
				{
							//For Checking sim is Presnt or Not
					if(m.isSimSlotEmpty())
					{
						System.out.println("Slot is Not Empty Sim is Present...");
					}
					else
					{
						System.out.println("Slot is Empty Thier is No Sim....");
					}
					break;
				}
				case 4:m.insertSim(new Sim("Jio","4g",9876543210l,1.25));
				{
					break;
				}
				case 5:m.removeSim();
				{
					break;
				}
				case 6:b=false;
				{
					break;
				}
				default :System.out.println("Leeee Testerrr See The Option Leee");
				break;
			}
		}while(b);
		 System.out.println("\t\t\t ****Thank You*****");
	}
}
