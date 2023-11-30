abstract class Hotel 
{
	//Specify my Features
	abstract public void muttonBiryani();
	abstract public void chickenBiryani();
	abstract public void parota();
	Hotel()
	{
		System.out.println("SivaKumar Hotel");
	}
}
 class Chef extends Hotel
{
	@Override
		public void muttonBiryani()
		{
			System.out.println("Mutton Biryani Created");
		}
	@Override
		public void chickenBiryani()
		{
			System.out.println("Chicken Biryani Created");
		}
		
	@Override
		public void parota()
		{
			System.out.println("Parota  Created");
		}
}