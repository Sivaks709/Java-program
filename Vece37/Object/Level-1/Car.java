//BluePrint
class Car 
{
	//states
	String name="BMW";
	double price=7000000;
	String color="Black";

	//Constructors
	Car()
	{
		//L.I
	}
	//Behaviours/features
	public void run()
	{
		System.out.println("Car is Running...");
	}

	public void stop()
	{
		System.out.println("Car is BEing Stopped");
	}
	public void details()
	{
		//NSC
		System.out.println("Car Name is :"+name);
		System.out.println("Car Price is :"+price);
		System.out.println("Car Color is :"+color);
		System.out.println("*****************************");
	}
}
