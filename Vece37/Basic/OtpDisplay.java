import java.util.Scanner;
class OtpDisplay 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)throws Exception 
	{
		System.out.println("Enter The Otp....");
		Thread.sleep(3000);//waiting fr 3 sec
		double res=9999*Math.random()+9999;
		int otp=(int)res;
		System.out.println(otp);//OTP is Visible for User
		int user_in=s.nextInt();
		System.out.println("\t\t Verification Succesfull...");
	}
}
