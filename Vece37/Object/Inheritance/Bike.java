class Vehicle 
{
	String name;
	double price;
	
	//NSMLI
	{
		System.out.println("Hi Iam NSMLI-Vehicle");	
	}

	Vehicle(){}

	Vehicle(String name,double price)
	{
		//L.I
		this.name=name;
		this.price=price;
	}
	public void run()
	{
		System.out.println("Vehicle is Running");		
	}
}
class Bike extends Vehicle
{
	int no_of_wheels;
	String color;
	
	//NSML
	{
		System.out.println("Hi Iam NSMLI Bike");
	}
	Bike()
	{
		//super()
		//L.I
	}
	Bike(int no_of_wheels,String color)
	{
		super("KTM",120000);
		//L.I
		this.no_of_wheels=no_of_wheels;
		this.color=color;
	}
}
