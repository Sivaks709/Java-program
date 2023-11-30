import java.util.Scanner;
class Dwiggy
{
	static Scanner s=new Scanner(System.in);
	static public void main(String [] tabbu)throws Exception
	{
		System.out.println("\tWelcome to Dwiggy...");
		System.out.println("\t\tAre You Hunger...\n");
		System.out.println("Select The Hotel\n");
		System.out.println("1.Taj Hotel\n2.S.S Hydrabadi\n3.Buhari\n4.A2B\n");
		int hotel=s.nextInt();//1
		switch (hotel)
		{
		case 1:{
			//    User Has Selected Taj Hotel
				System.out.println("\t Thank You For Selecting Taj\n");
				System.out.println("\tSelect Your Food\n");
				Thread.sleep(2000);
				System.out.println("1.Chicken Biryani\n2.Mutton Biryani\n3.Rabbit Biryani\n4.Prawn Biryani\n");
				int food=s.nextInt();//1
				switch (food)
				{
				case 1:{
					//  User is Trying to Order Chicken Biryani
						double per_plate=120;
						System.out.println("Enter The Quantity");
						int qty=s.nextInt();
						double bill=qty*per_plate;
						System.out.println("Your Total Bill :"+bill);
						Thread.sleep(2000);
						System.out.println("Please Select Your Payment Mode\n");
						Thread.sleep(2000);
						System.out.println("1.Google-Pay\n2.Phone Pay\n");
						int payment_mode=s.nextInt();//1
						switch (payment_mode)
						{
						case 1:{
							// Google Payment Mode selected
							System.out.println("Enter The Total Bill Amount: "+bill);
							double user_bill=s.nextDouble();
							if(bill==user_bill)
							{
								//Amount eneterd is Correct
								System.out.println("Please Enter The OTP\n");
								Thread.sleep(4000);//waiting for OTP
								double ot=9999*Math.random()+9999;
								int sys_otp=(int)ot;//otp variable Sys otp
								System.out.println(sys_otp);
								int user_otp=s.nextInt();
								if(sys_otp==user_otp)
								{
									System.out.println("Transaction Succesfull");
									Thread.sleep(2000);
									System.out.println("Order Placed Succesfully\n Delivered in 10 Seconds");
									Thread.sleep(7000);
									System.out.println("Thank You For Using Dwiggy....\n");
									Thread.sleep(5000);
								}
							}
							else
								System.out.println("Trasaction Failed..");
						break;}
						
						}

					break;}
				
				}
		break;}
		default:System.out.println("I Can Understand Your Mental Health");
		break;
		}
		System.out.println(" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2);

	}
}