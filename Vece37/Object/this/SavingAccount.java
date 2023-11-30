import java.util.*;
class SavingAccount 
{
	static Scanner s=new Scanner(System.in);
	//states
	String acc_holder_name;
	long acc_no;
	String ifsc;
	long contact;
	double bal=0.0;
	//Constructors
	SavingAccount()
	{
	}

	SavingAccount(String acc_holder_name,long acc_no,String ifsc,long contact)
	{
		//L.I (Load all NSM into Onj)
		this.acc_holder_name=acc_holder_name;
		this.acc_no=acc_no;
		this.ifsc=ifsc;
		this.contact=contact;//PWI will initiliaze GM)
	}
	//behavious
	public void deposite(double d)
	{
		this.bal+=d;
		System.out.println("Deposite Done Succesfully ");
		System.out.println("Account Bal :"+bal);
	}
	public void withdraw(double w)
	{
		if(bal>=w && bal>0)
		{
			bal-=w;
			System.out.println("Withdraw Succesfully");
			System.out.println("Account Bal :"+bal);
		}
		else
			System.out.println("InSufficent Balance");
	}
	public void chageContact(long new_contact)throws Exception
	{
		//verification 
		System.out.println("Enter Your Account Number");
		long acc_no=s.nextLong();//user enter acc_no
		if(this.acc_no==acc_no)//account num verification succesfull
		{
			//generate Otp
			double o=Math.random()*9999+9999;
			int sys_otp=(int)o;
			System.out.println("Enter The OTP...");
			Thread.sleep(3000);
			System.out.println(sys_otp);
			int user_otp=s.nextInt();//user entered otp is Stored
			if(sys_otp==user_otp)
			{
				//verification of otp issuccesfull
					this.contact=new_contact;
					System.out.println("Contact Updated..");
			}
			else
				System.out.println("Verification of OTP Failed...");
		}
		else
			System.out.println("Verification of Account Numer Fail");
	}

	public static SavingAccount savingAccountRef(String acc_holder_name,long acc_no,String ifsc,long contact)
	{
		return new SavingAccount(acc_holder_name,acc_no,ifsc,contact);
	}
	public void details()
	{
		System.out.println("Account Holder Name :"+acc_holder_name);
		System.out.println("Account Number:"+this.acc_no);
		System.out.println("Branch Ifsc :"+ifsc);
		System.out.println("Account Holder Contact :"+contact);
		System.out.println("Account Balance :"+bal);
		System.out.println("***************************************");
	}
}
