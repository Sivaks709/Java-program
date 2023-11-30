import java.util.Scanner;
class UserInterface 
{
	static Scanner s=new Scanner(System.in);
	static boolean b=true;
	static Bag bag=new Bag();
	public static void main(String[] args) 
	{
		do
		{
			System.out.println((char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" Welcome To PlayGround  "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2);
			System.out.println("1.Add Ball\n2.Remove Ball\n3.Check Bag is Empty\n4.Show Game\n5.Exit\n");
			System.out.print("Select The Inputs : ");
			int input=s.nextInt();
			switch (input)
			{
				case 1:
				{
					//Trying to Add Ball
					System.out.println("Select The Input..");
					System.out.println("1.Tennis Ball\n2.Basket Ball\n");
					int user_wish=s.nextInt();
					switch (user_wish)
					{
						case 1:
						{
							//Wishing to add Tennis Ball
							bag.addBall(new TennisBall());
							break;
						}
						case 2:
						{
							bag.addBall(new BasketBall());
							break;
						}
							
					}
					break;
				}
				case 2:
				{
					//Removeing The Ball
					bag.removeBall();
					break;
				}
				case 3:
				{
					//Checking Bag is Empty or Not
					if (bag.isBagEmpty())
					{
						System.out.println("Bag is Empty");
					}
					else
					{
						System.out.println("Bag is Not Empty");
					}
					break;
				}
				case 4:
				{
					bag.showGame();
					break;
				}
				case 5:
				{
					b=false;
					System.out.println("\t\t *********Thank You**********");
					break;
				}
				default :
				{
					System.out.println("Leee Loooosu See the Option...");
					break;
				}
			}
		}while (b);
	}
}
