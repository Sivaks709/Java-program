class Wbt 
{
	public static void main(String[] args) throws Exception
	{
		SavingAccount ref=SavingAccount.savingAccountRef("Tabrez",1234567890l,"IcIc0001",9876543210l);
		System.out.println("Before Depositing :"+ref.bal);
		ref.deposite(1000);
		System.out.println("After Depositing :"+ref.bal);
		System.out.println("Before The Contact :"+ref.contact);
		ref.chageContact(123654789);
		System.out.println("After Updating The Contact :"+ref.contact);

		
	}
}
